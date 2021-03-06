/*******************************************************************************
 * Copyright (c) 2009 Alexander Koderman <ak[at]sernet[dot]de>.
 * This program is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 
 * of the License, or (at your option) any later version.
 *     This program is distributed in the hope that it will be useful,    
 * but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU Lesser General Public License for more details.
 *     You should have received a copy of the GNU Lesser General Public 
 * License along with this program. 
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Alexander Koderman <ak[at]sernet[dot]de> - initial API and implementation
 ******************************************************************************/
package sernet.gs.ui.rcp.main.preferences;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;

import sernet.gs.ui.rcp.gsimport.RestoreDbTask;
import sernet.gs.ui.rcp.main.Activator;
import sernet.gs.ui.rcp.main.ExceptionUtil;

/**
 * GS Tool Import database settings
 * 
 * @author akoderman[at]sernet[dot]de
 * 
 */
public class GSImportRestorePreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    public static final String ID = "sernet.gs.ui.rcp.main.preferences.gsimportrestorepreferencepage"; //$NON-NLS-1$

    private FileFieldEditor gstoolDumpFile;

    private boolean showWarning = true;

    private boolean showDirWarning = true;

    private StringFieldEditor attachDb;

    private DirectoryFieldEditor toDirField;

    public GSImportRestorePreferencePage() {
        super(GRID);
        setPreferenceStore(Activator.getDefault().getPreferenceStore());
        setDescription(Messages.getString("GSImportRestorePreferencePage.1")); //$NON-NLS-1$
    }

    /**
     * Creates the field editors. Field editors are abstractions of the common
     * GUI blocks needed to manipulate various types of preferences. Each field
     * editor knows how to save and restore itself.
     */
    @Override
    public void createFieldEditors() {

        gstoolDumpFile = new FileFieldEditor(PreferenceConstants.GSTOOL_RESTOREDB_FILE, Messages.getString("GSImportRestorePreferencePage.2"), getFieldEditorParent()) { //$NON-NLS-1$
            @Override
            public boolean isValid() {
                // always return true, file may be on different host and entered
                // manually
                return true;
            }
        };

        // set dbName to filename as default:
        gstoolDumpFile.getTextControl(getFieldEditorParent()).addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                Pattern pat = Pattern.compile("[/\\\\](\\w*?)(.BAK|.bak)"); //$NON-NLS-1$
                Matcher matcher = pat.matcher(gstoolDumpFile.getStringValue());
                if (matcher.find()) {
                    String dbName = matcher.group(1);
                    attachDb.setStringValue(dbName);
                }
            }
        });

        gstoolDumpFile.setFileExtensions(new String[] { "*.BAK;*.bak", "*.*" }); //$NON-NLS-1$ //$NON-NLS-2$
        addField(gstoolDumpFile);

        attachDb = new StringFieldEditor(PreferenceConstants.GS_DB_RESTOREDB_NAME, Messages.getString("GSImportRestorePreferencePage.6"), getFieldEditorParent()); //$NON-NLS-1$
        addField(attachDb);

        toDirField = new DirectoryFieldEditor(PreferenceConstants.GS_DB_RESTOREDB_TODIR, Messages.getString("GSImportRestorePreferencePage.7"), getFieldEditorParent()) { //$NON-NLS-1$
            @Override
            public boolean isValid() {
                // may be a remote dir, so is always valid
                return true;
            }
        };
        addField(toDirField);

        createAttachButton();

    }

    private void createAttachButton() {
        Button button = new Button((Composite) getControl(), SWT.PUSH);
        button.setText(Messages.getString("GSImportRestorePreferencePage.8")); //$NON-NLS-1$
        button.setLayoutData(new GridData(GridData.END, GridData.BEGINNING, true, true));
        button.addSelectionListener(new SelectionListener() {
            public void widgetDefaultSelected(SelectionEvent e) {
            }

            public void widgetSelected(SelectionEvent e) {
                String url = Activator.getDefault().getPluginPreferences().getString(PreferenceConstants.GS_DB_URL);
                Pattern pat = Pattern.compile("/(\\w*?)$"); //$NON-NLS-1$
                Matcher matcher = pat.matcher(url);
                boolean found = matcher.find();
                if (!found) {
                    ExceptionUtil.log(new Exception(Messages.getString("GSImportRestorePreferencePage.10")), Messages.getString("GSImportRestorePreferencePage.11")); //$NON-NLS-1$ //$NON-NLS-2$
                    return;
                }
                String oldDbName = matcher.group(1);

                final String urlString = url.replace(oldDbName, "master"); //$NON-NLS-1$
                final String userString = Activator.getDefault().getPluginPreferences().getString(PreferenceConstants.GS_DB_USER);
                final String passString = Activator.getDefault().getPluginPreferences().getString(PreferenceConstants.GS_DB_PASS);
                final String fileName = gstoolDumpFile.getStringValue();
                final String newDbName = attachDb.getStringValue();
                final String toDir = toDirField.getStringValue();

                boolean doIt = MessageDialog.openConfirm(getShell(), Messages.getString("GSImportRestorePreferencePage.13"), //$NON-NLS-1$
                        NLS.bind(Messages.getString("GSImportRestorePreferencePage.9"), new Object[] { urlString, fileName, newDbName, toDir })); //$NON-NLS-1$
                if (!doIt) {
                    return;
                }

                try {
                    PlatformUI.getWorkbench().getProgressService().busyCursorWhile(new IRunnableWithProgress() {
                        public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                            Activator.inheritVeriniceContextState();

                            RestoreDbTask task = new RestoreDbTask();
                            try {
                                task.restoreDBFile(urlString, userString, passString, fileName, newDbName, toDir);
                                Display.getDefault().syncExec(new Runnable() {
                                    public void run() {
                                        MessageDialog.openInformation(getShell(), Messages.getString("GSImportRestorePreferencePage.19"), NLS.bind(Messages.getString("GSImportRestorePreferencePage.20"), newDbName)); //$NON-NLS-1$
                                    }
                                });
                            } catch (SQLException e) {
                                ExceptionUtil.log(e, Messages.getString("GSImportRestorePreferencePage.22") + fileName + ", " + e.getLocalizedMessage()); //$NON-NLS-1$
                            } catch (ClassNotFoundException e) {
                                ExceptionUtil.log(e, "Konnte Datenbankdatei nicht anhängen " + fileName); //$NON-NLS-1$
                            }
                        }
                    });
                } catch (InvocationTargetException e1) {
                    ExceptionUtil.log(e1, Messages.getString("GSImportRestorePreferencePage.4")); //$NON-NLS-1$
                } catch (InterruptedException e1) {
                    ExceptionUtil.log(e1, Messages.getString("GSImportRestorePreferencePage.25")); //$NON-NLS-1$
                }
            }
        });
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        super.propertyChange(event);
        if (event.getSource().equals(toDirField) && toDirField.getStringValue() != null && toDirField.getStringValue().length() > 0) {

            String url = Activator.getDefault().getPluginPreferences().getString(PreferenceConstants.GS_DB_URL);

            if (showDirWarning && !(url.indexOf("localhost") > -1 || url.indexOf("127.0.0.1") > -1)) { //$NON-NLS-1$ //$NON-NLS-2$
                showDirWarning = false;
                MessageDialog.openWarning(getShell(), Messages.getString("GSImportRestorePreferencePage.28"), Messages.getString("GSImportRestorePreferencePage.29")); //$NON-NLS-1$ //$NON-NLS-2$
            }

        }

        if (event.getSource().equals(this.gstoolDumpFile) && gstoolDumpFile.getStringValue() != null && gstoolDumpFile.getStringValue().length() > 0) {

            String url = Activator.getDefault().getPluginPreferences().getString(PreferenceConstants.GS_DB_URL);

            if (showWarning && !(url.indexOf("localhost") > -1 || url.indexOf("127.0.0.1") > -1)) { //$NON-NLS-1$ //$NON-NLS-2$
                showWarning = false;
                MessageDialog.openWarning(getShell(), Messages.getString("GSImportRestorePreferencePage.32"), Messages.getString("GSImportRestorePreferencePage.33")); //$NON-NLS-1$ //$NON-NLS-2$
            }
        }

        if (event.getProperty().equals(FieldEditor.VALUE)) {
            checkState();
        }
    }

    @Override
    protected void checkState() {
        super.checkState();
        if (!isValid()) {
            return;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
     */
    public void init(IWorkbench workbench) {
    }

}

/*******************************************************************************
 * Copyright (c) 2010 Daniel Murygin.
 *
 * This program is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,    
 * but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. 
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Daniel Murygin <dm[at]sernet[dot]de> - initial API and implementation
 ******************************************************************************/
package sernet.verinice.samt.audit.rcp;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;

import sernet.gs.ui.rcp.main.ImageCache;
import sernet.gs.ui.rcp.main.bsi.editors.EditorFactory;
import sernet.gs.ui.rcp.main.common.model.CnAElementFactory;
import sernet.gs.ui.rcp.main.common.model.CnAElementHome;
import sernet.gs.ui.rcp.main.connect.RetrieveInfo;
import sernet.verinice.iso27k.service.Retriever;
import sernet.verinice.model.common.CnATreeElement;
import sernet.verinice.model.iso27k.Audit;
import sernet.verinice.model.iso27k.AuditGroup;
import sernet.verinice.model.iso27k.Organization;

/**
 * Set the {@link CnATreeElement} type which is displayed in a
 * {@link GenericElementView}
 * 
 * @author Daniel Murygin <dm[at]sernet[dot]de>
 */
@SuppressWarnings("restriction")
public class AddAction extends Action {

    private static final Logger LOG = Logger.getLogger(AddAction.class);

    private String objectTypeId;

    private GenericElementView groupView;

    /**
     * Creates an action to set the typeId of an groupView
     * 
     * @param groupView
     *            the view the type is displyed
     * @param typeId
     *            {@link CnATreeElement} type
     * @param groupView
     */
    public AddAction(String typeId, GenericElementView groupView) {
        this.objectTypeId = typeId;
        setText(typeId);
        setImageDescriptor(ImageDescriptor.createFromImage(ImageCache.getInstance().getISO27kTypeImage(objectTypeId)));
        this.groupView = groupView;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.action.Action#run()
     */
    @Override
    public void run() {
        try {
            CnATreeElement group = getGroup();
            if (group != null) {
                group = Retriever.retrieveElement(group,new RetrieveInfo().setProperties(true).setChildren(true).setParent(true));
                CnATreeElement newElement = CnAElementFactory.getInstance().saveNew(group, this.objectTypeId, null);
                if (LOG.isDebugEnabled()) {
                    LOG.debug("New element - type: " + newElement.getObjectType() + ", title: " + newElement.getTitle() + ", group: " + group.getTitle());
                }
                // create a link to last selected (foreign) element
                // if no group in this view is selected
                if (groupView.getSelectedElement() != null && groupView.getSelectedGroup() == null) {
                    // this method also fires events for added links:
                    CnAElementHome.getInstance().createLinksAccordingToBusinessLogic(newElement, Arrays.asList(groupView.getSelectedElement()));
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("New element linked - type: " + groupView.getSelectedElement().getObjectType() + ", title: " + groupView.getSelectedElement().getTitle());
                    }
                }
                if (newElement != null) {
                    EditorFactory.getInstance().openEditor(newElement);
                }
            } else {
                LOG.warn("Can't add element. No group found. Type: " + this.objectTypeId);
            }
        } catch (Exception e) {
            LOG.error("Error while creating new element", e);
        }
    }

    private CnATreeElement getGroup() {
        CnATreeElement group = groupView.getSelectedGroup();
        if (group == null) {
            if (Audit.TYPE_ID.equals(this.objectTypeId) || AuditGroup.TYPE_ID.equals(this.objectTypeId)) {
                Organization org = groupView.getSelectedOrganization();
                if (org != null) {
                    group = org.getGroup(this.objectTypeId);
                }
            } else {
                Audit audit = groupView.getSelectedAudit();
                if (audit != null) {
                    group = audit.getGroup(this.objectTypeId);
                }
            }
        }
        return group;
    }

}
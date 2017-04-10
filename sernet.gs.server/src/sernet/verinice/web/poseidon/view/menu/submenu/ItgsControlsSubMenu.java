/*******************************************************************************
 * Copyright (c) 2017 Benjamin Weißenfels.
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
 *     @author Benjamin Weißenfels <bw[at]sernet[dot]de> - initial API and implementation
 ******************************************************************************/
package sernet.verinice.web.poseidon.view.menu.submenu;

import org.primefaces.model.menu.DefaultMenuItem;

import sernet.verinice.model.bsi.ITVerbund;
import sernet.verinice.web.poseidon.services.MenuService;
import sernet.verinice.web.poseidon.view.menu.menuitem.ControlsChartMenuItem;

/**
 * @author Benjamin Weißenfels <bw[at]sernet[dot]de>
 *
 */
public class ItgsControlsSubMenu extends AbstractMainSubMenu {

    private static final long serialVersionUID = 1L;

    private MenuService menuService;

    public ItgsControlsSubMenu(MenuService menuService) {
        super("Massnahmen GS");
        this.menuService = menuService;
    }

    @Override
    protected void loadChildren() {

        DefaultMenuItem all = new DefaultMenuItem("Alle");
        all.setUrl("/dashboard/controls-all.xhtml");
        all.setIcon("fa fa-fw fa-area-chart");

        DefaultMenuItem total = new DefaultMenuItem("Gesamt");
        total.setUrl("/dashboard/controls-total.xhtml");
        total.setIcon("fa fa-fw fa-area-chart");

        addElement(all);
        addElement(total);

        for (ITVerbund itNetwork : menuService.getVisibleItNetworks()) {
            super.addElement(new ControlsChartMenuItem(itNetwork));
        }
    }

    @Override
    public String getIcon() {
        return "fa fa-fw fa-line-chart";
    }
}

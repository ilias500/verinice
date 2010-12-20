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
package sernet.verinice.bpm;

import org.jbpm.api.jpdl.DecisionHandler;
import org.jbpm.api.model.OpenExecution;

/**
 * @author Daniel Murygin <dm[at]sernet[dot]de>
 *
 */
public class ControlEvaluation implements DecisionHandler {

    
    public static final String IS_NOT_ASSIGNED = "isNotAssigned";
    
    /* (non-Javadoc)
     * @see org.jbpm.api.jpdl.DecisionHandler#decide(org.jbpm.api.model.OpenExecution)
     */
    @Override
    public String decide(OpenExecution arg0) {
        // TODO Auto-generated method stub
        return IS_NOT_ASSIGNED;
    }

}
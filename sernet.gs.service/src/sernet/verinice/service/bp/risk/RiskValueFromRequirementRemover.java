/*******************************************************************************
 * Copyright (c) 2018 Daniel Murygin.
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
 ******************************************************************************/
package sernet.verinice.service.bp.risk;

import java.util.Set;

import org.apache.log4j.Logger;

import sernet.verinice.model.bp.elements.BpRequirement;
import sernet.verinice.model.bp.risk.configuration.RiskConfigurationUpdateContext;
import sernet.verinice.model.common.CnATreeElement;

/**
 * Purposes of this class:
 * 
 * Remove frequencies and impacts from requirements that are no longer in the
 * configuration.
 * 
 * The changes made to requirements in this class are not saved directly by this
 * class, they are saved indirectly by Hibernate. To ensure that the changes are
 * really saved, this class must be used in a JDBC transaction. The JDBC
 * transaction management is configured by Spring.
 */
public class RiskValueFromRequirementRemover extends RiskValueRemover {

    static final Logger log = Logger.getLogger(RiskValueFromRequirementRemover.class);

    public RiskValueFromRequirementRemover(RiskConfigurationUpdateContext updateContext,
            Set<CnATreeElement> requirementsFromScope) {
        super(updateContext, requirementsFromScope);
    }

    protected String getFrequencyPropertyId() {
        return BpRequirement.PROP_SAFEGUARD_STRENGTH_FREQUENCY;
    }

    protected String getImpactPropertyId() {
        return BpRequirement.PROP_SAFEGUARD_STRENGTH_IMPACT;
    }

    protected void saveNumberOfChangedElements(int numberOfChangedElements) {
        updateResult.setNumberOfChangedRequirements(numberOfChangedElements);
    }

}

/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.validation.rules.ju.testcases.dwf_df;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.test.framework.api.OracleDefinition;

/**
 * test on DWF_DF_15: SequenceLinks between FCIFunctions/Control Nodes with no Functional Exchanges connecting them
 * @generated
 */
public class Rule_DWF_DF_15 extends Project_DWF_DF_for_SL_CN {

	/**
	 * @see org.polarsys.capella.test.validation.rules.ju.testcases.ValidationRuleTestCase#getTargetedEClass()
	 * @generated
	 */
	protected EClass getTargetedEClass() {
		return FaPackage.Literals.SEQUENCE_LINK;
	}

	/**
	 * @see org.polarsys.capella.test.validation.rules.ju.testcases.ValidationRuleTestCase#getRuleID()
	 * @generated
	 */
	protected String getRuleID() {
		return "org.polarsys.capella.core.data.fa.validation.DWF_DF_15";
	}

	/**
	 * @see org.polarsys.capella.test.validation.rules.ju.testcases.ValidationRulePartialTestCase#getScopeDefinition()
	 * @generated
	 */
	protected List<String> getScopeDefinition() {
		return Arrays.asList(new String[] {
		    LA_SEQUENCE_LINK_1,
				LA_SEQUENCE_LINK_2,
				LA_SEQUENCE_LINK_3,
				LA_SEQUENCE_LINK_4,
				LA_SEQUENCE_LINK_5,
				LA_SEQUENCE_LINK_6,
				LA_SEQUENCE_LINK_7,
				LA_SEQUENCE_LINK_8,
				LA_SEQUENCE_LINK_9
		});
	}

	/**
	 * @see org.polarsys.capella.test.validation.rules.ju.testcases.ValidationRuleTestCase#getOracleDefinitions()
	 * @generated
	 */
	protected List<OracleDefinition> getOracleDefinitions() {
		return Arrays.asList(new OracleDefinition[] { 
		    new OracleDefinition(LA_SEQUENCE_LINK_2, 1),
		    new OracleDefinition(LA_SEQUENCE_LINK_3, 1),
		    new OracleDefinition(LA_SEQUENCE_LINK_6, 1),
		    new OracleDefinition(LA_SEQUENCE_LINK_7, 1),
		    new OracleDefinition(LA_SEQUENCE_LINK_8, 1),
		    new OracleDefinition(LA_SEQUENCE_LINK_9, 1) // is in invalid: in opposite direction
		});
	}
}

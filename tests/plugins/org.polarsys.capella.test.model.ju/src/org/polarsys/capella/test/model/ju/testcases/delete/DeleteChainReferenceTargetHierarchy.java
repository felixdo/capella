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
package org.polarsys.capella.test.model.ju.testcases.delete;

public class DeleteChainReferenceTargetHierarchy extends DeleteTest {

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mustExist(SA__ROOT_SF__FUNCTIONAL_CHAIN_INVOLVEMENT_LINK_TO_FE3_1);
    mustExist(SA__ROOT_SF__SEQUENCE_LINK);
  }
  
  @Override
  public void test() {
    removeElement(SA__ROOT_SF__FUNCTIONAL_CHAIN_REFERENCE_TO_FC3_3);
    mustBeRemoved(SA__ROOT_SF__FUNCTIONAL_CHAIN_INVOLVEMENT_LINK_TO_FE3_1);
    mustBeRemoved(SA__ROOT_SF__SEQUENCE_LINK);
  }

}

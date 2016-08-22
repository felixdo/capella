/*******************************************************************************
 * Copyright (c) 2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.data.menu.contributions.information;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.polarsys.capella.common.data.modellingcore.AbstractType;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.common.mdsofa.common.constant.ICommonConstants;
import org.polarsys.capella.core.data.capellacore.Type;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.information.Collection;
import org.polarsys.capella.core.data.information.CollectionValue;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.datatype.StringType;
import org.polarsys.capella.core.data.information.datavalue.DatavaluePackage;

public class LiteralStringValueItemContribution extends DataNamingHelperBasedContribution {

  /**
   * @see org.polarsys.capella.common.ui.menu.IMDEMenuItemContribution#selectionContribution()
   */
  @Override
  public boolean selectionContribution(ModelElement modelElement, EClass cls, EStructuralFeature feature) {

    if (feature == ModellingcorePackage.Literals.ABSTRACT_CONSTRAINT__OWNED_SPECIFICATION){
      return false;
    }

    boolean select = !(modelElement instanceof AbstractFunction);

    if (feature.equals(InformationPackage.Literals.COLLECTION_VALUE__OWNED_ELEMENTS)
     || feature.equals(InformationPackage.Literals.COLLECTION_VALUE__OWNED_DEFAULT_ELEMENT))
    {
      if (modelElement instanceof CollectionValue) {
        AbstractType cvType = ((CollectionValue) modelElement).getAbstractType();
        if (cvType instanceof Collection) {
          Type cType = ((Collection) cvType).getType(); {
            if (!(cType instanceof StringType)) {
              select = false;
            }
          }
        }
      }
    }

    if (feature.equals(InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE)
     || feature.equals(InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE)
     || feature.equals(InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE)
     || feature.equals(InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE))
    {
      if (modelElement instanceof Collection) {
        Type cType = ((Collection) modelElement).getType();
        if (!(cType instanceof StringType)) {
          select = false;
        }
      }
    }

    return select;
  }

  /**
   * @see org.polarsys.capella.common.ui.menu.IMDEMenuItemContribution#executionContribution()
   */
  public Command executionContribution(final EditingDomain editingDomain, ModelElement containerElement, final ModelElement createdElement, EStructuralFeature feature) {
    if (DatavaluePackage.Literals.LITERAL_STRING_VALUE.isInstance(createdElement)) {
      return new SetCommand(editingDomain, createdElement, DatavaluePackage.Literals.LITERAL_STRING_VALUE__VALUE, ICommonConstants.EMPTY_STRING);
    }
    return null;
  }

  /**
   * @see org.polarsys.capella.common.ui.menu.IMDEMenuItemContribution#getMetaclass()
   */
  @Override
  public EClass getMetaclass() {
    return DatavaluePackage.Literals.LITERAL_STRING_VALUE;
  }
}

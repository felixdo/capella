/**
 *
 *  Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     Thales - initial API and implementation
 */

package org.polarsys.capella.core.data.capellacommon;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.common.data.behavior.AbstractEvent;
import org.polarsys.capella.core.data.capellacore.Constraint;
import org.polarsys.capella.core.data.capellacore.NamedElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.StateEvent#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.StateEvent#getOwnedStateEventRealizations <em>Owned State Event Realizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.data.capellacommon.CapellacommonPackage#getStateEvent()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='An event used in statemachine definition which occurs at a given condition. \r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='../img/usage_examples/example_statemachine.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='none' explanation='none' constraints='none'"
 * @generated
 */

public interface StateEvent extends NamedElement, AbstractEvent {





	/**
   * Returns the value of the '<em><b>Condition</b></em>' reference.

   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' reference.
   * @see #setCondition(Constraint)
   * @see org.polarsys.capella.core.data.capellacommon.CapellacommonPackage#getStateEvent_Condition()
   * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::ChangeEvent::changeExpression if current element is a ChangeEvent\r\numl::TimeEvent::when if current element is a TimeEvent\r\n' base\040metaclass\040in\040UML/SysML\040profile\040='uml::ChangeEvent and uml::TimeEvent\r\n' explanation='none' constraints='none'"
   * @generated
   */

	Constraint getCondition();




	/**
   * Sets the value of the '{@link org.polarsys.capella.core.data.capellacommon.StateEvent#getCondition <em>Condition</em>}' reference.

   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' reference.
   * @see #getCondition()
   * @generated
   */

	void setCondition(Constraint value);







	/**
   * Returns the value of the '<em><b>Owned State Event Realizations</b></em>' containment reference list.
   * The list contents are of type {@link org.polarsys.capella.core.data.capellacommon.StateEventRealization}.

   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State Event Realizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Owned State Event Realizations</em>' containment reference list.
   * @see org.polarsys.capella.core.data.capellacommon.CapellacommonPackage#getStateEvent_OwnedStateEventRealizations()
   * @model containment="true" resolveProxies="true"
   *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the realization links that are owned/contained in this StateEvent\r\n[source: Capella study]' constraints='none' comment/notes='none'"
   *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='Elements are contained in the nearest possible parent container.' constraints='Some elements on which StateEventRealization stereotype or any stereotype that inherits from it is applied'"
   * @generated
   */

	EList<StateEventRealization> getOwnedStateEventRealizations();





} // StateEvent

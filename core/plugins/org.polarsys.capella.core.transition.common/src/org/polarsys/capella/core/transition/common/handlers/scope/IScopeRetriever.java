/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.transition.common.handlers.scope;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.transition.common.handlers.IHandler;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 *
 */
public interface IScopeRetriever extends IHandler {

  /**
   * @param element_p
   * @param context_p
   * @return
   */
  public Collection<? extends EObject> retrieveRelatedElements(EObject element_p, IContext context_p);

  public Collection<? extends EObject> retrieveSharedElements(IContext context_p);

}
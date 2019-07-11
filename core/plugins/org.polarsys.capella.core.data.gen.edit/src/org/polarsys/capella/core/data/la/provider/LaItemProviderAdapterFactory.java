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
package org.polarsys.capella.core.data.la.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.polarsys.capella.common.data.activity.AbstractActivity;
import org.polarsys.capella.common.data.activity.ActivityGroup;
import org.polarsys.capella.common.data.activity.ActivityPackage;
import org.polarsys.capella.common.data.activity.util.ActivitySwitch;
import org.polarsys.capella.core.data.capellamodeller.provider.CapellaModellerEditPlugin;
import org.polarsys.capella.core.data.la.LaFactory;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.la.util.LaAdapterFactory;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;
import org.polarsys.kitalpha.emde.extension.edit.ChildCreationExtenderManager;
import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LaItemProviderAdapterFactory extends LaAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(CapellaModellerEditPlugin.INSTANCE, LaPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.la.LogicalArchitecturePkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalArchitecturePkgItemProvider logicalArchitecturePkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.la.LogicalArchitecturePkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalArchitecturePkgAdapter() {
		if (logicalArchitecturePkgItemProvider == null) {
			logicalArchitecturePkgItemProvider = new LogicalArchitecturePkgItemProvider(this);
		}

		return logicalArchitecturePkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.la.LogicalArchitecture} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalArchitectureItemProvider logicalArchitectureItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.la.LogicalArchitecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalArchitectureAdapter() {
		if (logicalArchitectureItemProvider == null) {
			logicalArchitectureItemProvider = new LogicalArchitectureItemProvider(this);
		}

		return logicalArchitectureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.la.LogicalFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalFunctionItemProvider logicalFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.la.LogicalFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalFunctionAdapter() {
		if (logicalFunctionItemProvider == null) {
			logicalFunctionItemProvider = new LogicalFunctionItemProvider(this);
		}

		return logicalFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.la.LogicalFunctionPkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalFunctionPkgItemProvider logicalFunctionPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.la.LogicalFunctionPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalFunctionPkgAdapter() {
		if (logicalFunctionPkgItemProvider == null) {
			logicalFunctionPkgItemProvider = new LogicalFunctionPkgItemProvider(this);
		}

		return logicalFunctionPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.la.LogicalComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalComponentItemProvider logicalComponentItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.la.LogicalComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalComponentAdapter() {
		if (logicalComponentItemProvider == null) {
			logicalComponentItemProvider = new LogicalComponentItemProvider(this);
		}

		return logicalComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.la.LogicalComponentPkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalComponentPkgItemProvider logicalComponentPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.la.LogicalComponentPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalComponentPkgAdapter() {
		if (logicalComponentPkgItemProvider == null) {
			logicalComponentPkgItemProvider = new LogicalComponentPkgItemProvider(this);
		}

		return logicalComponentPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.la.CapabilityRealization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityRealizationItemProvider capabilityRealizationItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.la.CapabilityRealization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapabilityRealizationAdapter() {
		if (capabilityRealizationItemProvider == null) {
			capabilityRealizationItemProvider = new CapabilityRealizationItemProvider(this);
		}

		return capabilityRealizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.la.CapabilityRealizationPkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityRealizationPkgItemProvider capabilityRealizationPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.la.CapabilityRealizationPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapabilityRealizationPkgAdapter() {
		if (capabilityRealizationPkgItemProvider == null) {
			capabilityRealizationPkgItemProvider = new CapabilityRealizationPkgItemProvider(this);
		}

		return capabilityRealizationPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.la.SystemAnalysisRealization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemAnalysisRealizationItemProvider systemAnalysisRealizationItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.la.SystemAnalysisRealization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAnalysisRealizationAdapter() {
		if (systemAnalysisRealizationItemProvider == null) {
			systemAnalysisRealizationItemProvider = new SystemAnalysisRealizationItemProvider(this);
		}

		return systemAnalysisRealizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.la.ContextInterfaceRealization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextInterfaceRealizationItemProvider contextInterfaceRealizationItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.la.ContextInterfaceRealization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContextInterfaceRealizationAdapter() {
		if (contextInterfaceRealizationItemProvider == null) {
			contextInterfaceRealizationItemProvider = new ContextInterfaceRealizationItemProvider(this);
		}

		return contextInterfaceRealizationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (logicalArchitecturePkgItemProvider != null) logicalArchitecturePkgItemProvider.dispose();
		if (logicalArchitectureItemProvider != null) logicalArchitectureItemProvider.dispose();
		if (logicalFunctionItemProvider != null) logicalFunctionItemProvider.dispose();
		if (logicalFunctionPkgItemProvider != null) logicalFunctionPkgItemProvider.dispose();
		if (logicalComponentItemProvider != null) logicalComponentItemProvider.dispose();
		if (logicalComponentPkgItemProvider != null) logicalComponentPkgItemProvider.dispose();
		if (capabilityRealizationItemProvider != null) capabilityRealizationItemProvider.dispose();
		if (capabilityRealizationPkgItemProvider != null) capabilityRealizationPkgItemProvider.dispose();
		if (systemAnalysisRealizationItemProvider != null) systemAnalysisRealizationItemProvider.dispose();
		if (contextInterfaceRealizationItemProvider != null) contextInterfaceRealizationItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link ActivityPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ActivityChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ActivitySwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseAbstractActivity(AbstractActivity object) {
				// begin-extension-code
				if (ModelExtensionHelper.getInstance(object).isExtensionModelDisabled(EcoreUtil.getRootContainer(object).eClass().getEPackage().getNsURI(), "http://www.polarsys.org/capella/core/la/1.4.0")) { //$NON-NLS-1$
					return null;				
				}
				// end-extension-code
                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (ActivityPackage.Literals.ABSTRACT_ACTIVITY__OWNED_NODES,
                         LaFactory.eINSTANCE.createLogicalFunction());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseActivityGroup(ActivityGroup object) {
				// begin-extension-code
				if (ModelExtensionHelper.getInstance(object).isExtensionModelDisabled(EcoreUtil.getRootContainer(object).eClass().getEPackage().getNsURI(), "http://www.polarsys.org/capella/core/la/1.4.0")) { //$NON-NLS-1$
					return null;				
				}
				// end-extension-code
                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (ActivityPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
                         LaFactory.eINSTANCE.createLogicalFunction());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
		   new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
		   return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return CapellaModellerEditPlugin.INSTANCE;
		}
	}

}

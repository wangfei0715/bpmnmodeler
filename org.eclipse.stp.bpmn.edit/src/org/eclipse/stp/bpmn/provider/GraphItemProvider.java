/******************************************************************************
* Copyright (c) 2006, Intalio Inc.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
*     Intalio Inc. - initial API and implementation
*******************************************************************************/

package org.eclipse.stp.bpmn.provider;



import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.stp.bpmn.BpmnFactory;
import org.eclipse.stp.bpmn.BpmnPackage;
import org.eclipse.stp.bpmn.Graph;

/**
 * This is the item provider adapter for a {@link org.eclipse.stp.bpmn.Graph} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphItemProvider
	extends IdentifiableNodeItemProvider
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = ""; //$NON-NLS-1$

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GraphItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addDocumentationPropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addNcnamePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Documentation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDocumentationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_NamedBpmnObject_documentation_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_NamedBpmnObject_documentation_feature", "_UI_NamedBpmnObject_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BpmnPackage.Literals.NAMED_BPMN_OBJECT__DOCUMENTATION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_NamedBpmnObject_name_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_NamedBpmnObject_name_feature", "_UI_NamedBpmnObject_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BpmnPackage.Literals.NAMED_BPMN_OBJECT__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Ncname feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNcnamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_NamedBpmnObject_ncname_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_NamedBpmnObject_ncname_feature", "_UI_NamedBpmnObject_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BpmnPackage.Literals.NAMED_BPMN_OBJECT__NCNAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Collection getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(BpmnPackage.Literals.ARTIFACTS_CONTAINER__ARTIFACTS);
            childrenFeatures.add(BpmnPackage.Literals.GRAPH__VERTICES);
            childrenFeatures.add(BpmnPackage.Literals.GRAPH__SEQUENCE_EDGES);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns Graph.gif.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Graph")); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getText(Object object) {
        String label = ((Graph)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Graph_type") : //$NON-NLS-1$
            getString("_UI_Graph_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(Graph.class)) {
            case BpmnPackage.GRAPH__DOCUMENTATION:
            case BpmnPackage.GRAPH__NAME:
            case BpmnPackage.GRAPH__NCNAME:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case BpmnPackage.GRAPH__ARTIFACTS:
            case BpmnPackage.GRAPH__VERTICES:
            case BpmnPackage.GRAPH__SEQUENCE_EDGES:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
     * describing all of the children that can be created under this object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (BpmnPackage.Literals.ARTIFACTS_CONTAINER__ARTIFACTS,
                 BpmnFactory.eINSTANCE.createArtifact()));

        newChildDescriptors.add
            (createChildParameter
                (BpmnPackage.Literals.ARTIFACTS_CONTAINER__ARTIFACTS,
                 BpmnFactory.eINSTANCE.createDataObject()));

        newChildDescriptors.add
            (createChildParameter
                (BpmnPackage.Literals.ARTIFACTS_CONTAINER__ARTIFACTS,
                 BpmnFactory.eINSTANCE.createGroup()));

        newChildDescriptors.add
            (createChildParameter
                (BpmnPackage.Literals.ARTIFACTS_CONTAINER__ARTIFACTS,
                 BpmnFactory.eINSTANCE.createTextAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (BpmnPackage.Literals.GRAPH__VERTICES,
                 BpmnFactory.eINSTANCE.createVertex()));

        newChildDescriptors.add
            (createChildParameter
                (BpmnPackage.Literals.GRAPH__VERTICES,
                 BpmnFactory.eINSTANCE.createActivity()));

        newChildDescriptors.add
            (createChildParameter
                (BpmnPackage.Literals.GRAPH__VERTICES,
                 BpmnFactory.eINSTANCE.createSubProcess()));

        newChildDescriptors.add
            (createChildParameter
                (BpmnPackage.Literals.GRAPH__SEQUENCE_EDGES,
                 BpmnFactory.eINSTANCE.createSequenceEdge()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResourceLocator getResourceLocator() {
        return BpmnEditPlugin.INSTANCE;
    }

}

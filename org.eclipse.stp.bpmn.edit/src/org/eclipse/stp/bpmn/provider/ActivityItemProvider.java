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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.stp.bpmn.Activity;
import org.eclipse.stp.bpmn.ActivityType;
import org.eclipse.stp.bpmn.BpmnPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.stp.bpmn.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider
	extends VertexItemProvider
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
	public ActivityItemProvider(AdapterFactory adapterFactory) {
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
            addOrderedMessagesPropertyDescriptor(object);
            addIncomingMessagesPropertyDescriptor(object);
            addOutgoingMessagesPropertyDescriptor(object);
            addGroupsPropertyDescriptor(object);
            addActivityTypePropertyDescriptor(object);
            addLanePropertyDescriptor(object);
            addLoopingPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Incoming Messages feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addIncomingMessagesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Activity_incomingMessages_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_Activity_incomingMessages_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BpmnPackage.Literals.ACTIVITY__INCOMING_MESSAGES,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Outgoing Messages feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addOutgoingMessagesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Activity_outgoingMessages_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_Activity_outgoingMessages_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BpmnPackage.Literals.ACTIVITY__OUTGOING_MESSAGES,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Groups feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGroupsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Activity_groups_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_Activity_groups_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BpmnPackage.Literals.ACTIVITY__GROUPS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Ordered Messages feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addOrderedMessagesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Activity_orderedMessages_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_Activity_orderedMessages_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BpmnPackage.Literals.ACTIVITY__ORDERED_MESSAGES,
                 true,
                 false,
                 true,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Activity Type feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addActivityTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Activity_activityType_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_Activity_activityType_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BpmnPackage.Literals.ACTIVITY__ACTIVITY_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
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
     * This adds a property descriptor for the Lane feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLanePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Activity_lane_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_Activity_lane_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BpmnPackage.Literals.ACTIVITY__LANE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Looping feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addLoopingPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Activity_looping_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_Activity_looping_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BpmnPackage.Literals.ACTIVITY__LOOPING,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
	 * Fetches the png in the sub-folder activities
	 * @notgenerated
	 */
	public Object getImage(Object object) {
        if (object instanceof Activity||object instanceof ActivityType) {
            String filename = TASK;
			switch (object instanceof Activity ? 
					((Activity)object).getActivityType().getValue() :
					((ActivityType)object).getValue()) {
			case ActivityType.TASK:
                if (object instanceof Activity && 
                		((Activity)object).isLooping()) {
                    filename = TASK_LOOPING;
                } else {
                    filename = TASK;
                }
                break;
            case ActivityType.EVENT_END_COMPENSATION:
                filename = END_COMPENSATION;
                break;
            case ActivityType.EVENT_END_EMPTY:
                filename = END_EMPTY;
                break;
            case ActivityType.EVENT_END_ERROR:
                filename = END_ERROR;
                break;
            case ActivityType.EVENT_END_MESSAGE:
                filename = END_MESSAGE;
                break;
            case ActivityType.EVENT_END_TERMINATE:
                filename = END_TERMINATE;
                break;
            case ActivityType.EVENT_INTERMEDIATE_COMPENSATION:
                filename = INTERMEDIATE_COMPENSATION;
                break;
            case ActivityType.EVENT_INTERMEDIATE_EMPTY:
                filename = INTERMEDIATE_EMPTY;
                break;
            case ActivityType.EVENT_INTERMEDIATE_ERROR:
                filename = INTERMEDIATE_ERROR;
                break;
            case ActivityType.EVENT_INTERMEDIATE_MESSAGE:
                filename = INTERMEDIATE_MESSAGE;
                break;
            case ActivityType.EVENT_INTERMEDIATE_RULE:
                filename = INTERMEDIATE_RULE;
                break;
            case ActivityType.EVENT_INTERMEDIATE_TIMER:
                filename = INTERMEDIATE_TIMER;
                break;
            case ActivityType.EVENT_INTERMEDIATE_CANCEL:
                filename = INTERMEDIATE_CANCEL;
                break;
            case ActivityType.EVENT_INTERMEDIATE_LINK:
                filename = INTERMEDIATE_LINK;
                break;
            case ActivityType.EVENT_INTERMEDIATE_MULTIPLE:
                filename = INTERMEDIATE_MULTIPLE;
                break;
            case ActivityType.EVENT_START_EMPTY:
                filename = START_EMPTY;
                break;
            case ActivityType.EVENT_START_MESSAGE:
                filename = START_MESSAGE;
                break;
            case ActivityType.EVENT_START_RULE:
                filename = START_RULE;
                break;
            case ActivityType.EVENT_START_LINK:
                filename = START_LINK;
                break;
            case ActivityType.EVENT_START_MULTIPLE:
                filename = START_MULTIPLE;
                break;
            case ActivityType.EVENT_START_TIMER:
                filename = START_TIMER;
                break;
            case ActivityType.GATEWAY_DATA_BASED_EXCLUSIVE:
                filename = GATEWAY_DATABASED_EXCLUSIVE;
                break;
            case ActivityType.GATEWAY_DATA_BASED_INCLUSIVE:
                filename = GATEWAY_DATABASED_INCLUSIVE;
                break;
            case ActivityType.GATEWAY_EVENT_BASED_EXCLUSIVE:
                filename = GATEWAY_EVENT_BASED;
                break;
            case ActivityType.GATEWAY_PARALLEL:
                filename = GATEWAY_PARALLEL;
                break;
            case ActivityType.GATEWAY_COMPLEX:
                filename = GATEWAY_COMPLEX;
                break;
            case ActivityType.SUB_PROCESS:
                filename = SUB_PROCESS;
                break;
			}
            return overlayImage(object, getResourceLocator().getImage("full/obj24/activities/" +  //$NON-NLS-1$
                    filename));
		}
		
		return getImageGen(object);
	}

    /**
     * This returns Activity.gif.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Object getImageGen(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Activity")); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getText(Object object) {
        String label = ((Activity)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Activity_type") : //$NON-NLS-1$
            getString("_UI_Activity_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch (notification.getFeatureID(Activity.class)) {
            case BpmnPackage.ACTIVITY__DOCUMENTATION:
            case BpmnPackage.ACTIVITY__NAME:
            case BpmnPackage.ACTIVITY__NCNAME:
            case BpmnPackage.ACTIVITY__ACTIVITY_TYPE:
            case BpmnPackage.ACTIVITY__LOOPING:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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

    public static final String END_COMPENSATION = "end_compensation"; //$NON-NLS-1$
    public static final String END_EMPTY = "end_empty"; //$NON-NLS-1$
    public static final String END_ERROR = "end_error"; //$NON-NLS-1$
    public static final String END_MESSAGE = "end_message"; //$NON-NLS-1$
    public static final String END_TERMINATE = "end_terminate"; //$NON-NLS-1$
    //TODO
    public static final String END_CANCEL = "end_empty"; //$NON-NLS-1$
    public static final String END_MULTIPLE = "end_empty"; //$NON-NLS-1$
    
    public static final String GATEWAY_DATABASED_EXCLUSIVE = "gateway_databased_exclusive"; //$NON-NLS-1$
    public static final String GATEWAY_DATABASED_INCLUSIVE = "gateway_databased_inclusive"; //$NON-NLS-1$
    public static final String GATEWAY_EVENT_BASED = "gateway_event_based"; //$NON-NLS-1$
    public static final String GATEWAY_PARALLEL = "gateway_parallel"; //$NON-NLS-1$
    public static final String GATEWAY_COMPLEX = "gateway_complex"; //$NON-NLS-1$
    public static final String INTERMEDIATE_CANCEL = "intermediate_cancel"; //$NON-NLS-1$
    public static final String INTERMEDIATE_COMPENSATION = "intermediate_compensation"; //$NON-NLS-1$
    public static final String INTERMEDIATE_EMPTY = "intermediate_empty"; //$NON-NLS-1$
    public static final String INTERMEDIATE_ERROR = "intermediate_error"; //$NON-NLS-1$
    public static final String INTERMEDIATE_MESSAGE = "intermediate_message"; //$NON-NLS-1$
    public static final String INTERMEDIATE_RULE = "intermediate_rule"; //$NON-NLS-1$
    public static final String INTERMEDIATE_TIMER = "intermediate_timer"; //$NON-NLS-1$
    //TODO
    public static final String INTERMEDIATE_LINK = "intermediate_empty"; //$NON-NLS-1$
    public static final String INTERMEDIATE_MULTIPLE = "intermediate_empty"; //$NON-NLS-1$
    public static final String INTERMEDIATE_ = "intermediate_timer"; //$NON-NLS-1$
    
    
    public static final String POOL = "pool"; //$NON-NLS-1$
    public static final String START_EMPTY = "start_empty"; //$NON-NLS-1$
    public static final String START_MESSAGE = "start_message"; //$NON-NLS-1$
    public static final String START_RULE = "start_rule"; //$NON-NLS-1$
    public static final String START_TIMER = "start_timer"; //$NON-NLS-1$
    //TODO: fix this
    public static final String START_LINK = "start_rule"; //$NON-NLS-1$
    public static final String START_MULTIPLE = "start_timer"; //$NON-NLS-1$
    public static final String SUB_PROCESS = "sub_process"; //$NON-NLS-1$
    public static final String SUB_PROCESS_EXPANDED = "sub_process_expanded"; //$NON-NLS-1$
    public static final String SUB_PROCESS_EXPANDED_LOOPING = "sub_process_expanded_looping"; //$NON-NLS-1$
    public static final String SUB_PROCESS_LOOPING = "sub_process_looping"; //$NON-NLS-1$
    public static final String TASK = "task";     //$NON-NLS-1$
    public static final String TASK_LOOPING = "task_looping";     //$NON-NLS-1$

    public static final String FLOW_CONNECTOR = "flow_connector";     //$NON-NLS-1$
    public static final String MESSAGE_CONNECTOR = "message_connector";     //$NON-NLS-1$



}
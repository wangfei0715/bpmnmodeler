/*
 * Copyright (c) 2007, Intalio Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Intalio Inc. - initial API and implementation
 */
package org.eclipse.stp.bpmn.diagram.edit.parts;

import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.core.util.ViewType;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.stp.bpmn.diagram.part.BpmnVisualIDRegistry;
import org.eclipse.stp.bpmn.figures.ConnectionLayerExEx;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class BpmnEditPartFactory implements EditPartFactory {

    /**
     * @generated
     */
    public static final String EXTERNAL_NODE_LABELS_LAYER = "External Node Labels"; //$NON-NLS-1$

    /**
     * @generated
     */
    public EditPart createEditPart(EditPart context, Object model) {
        if (model instanceof View) {
            View view = (View) model;
            int viewVisualID = BpmnVisualIDRegistry.getVisualID(view);
            switch (viewVisualID) {
            case PoolEditPart.VISUAL_ID:
                return new PoolEditPart(view);
            case PoolNameEditPart.VISUAL_ID:
                return new PoolNameEditPart(view);
            case TextAnnotation2EditPart.VISUAL_ID:
                return new TextAnnotation2EditPart(view);
            case TextAnnotationName2EditPart.VISUAL_ID:
                return new TextAnnotationName2EditPart(view);
            case DataObject2EditPart.VISUAL_ID:
                return new DataObject2EditPart(view);
            case DataObjectName2EditPart.VISUAL_ID:
                return new DataObjectName2EditPart(view);
            case Group2EditPart.VISUAL_ID:
                return new Group2EditPart(view);
            case GroupName2EditPart.VISUAL_ID:
                return new GroupName2EditPart(view);
            case ActivityEditPart.VISUAL_ID:
                return new ActivityEditPart(view);
            case ActivityNameEditPart.VISUAL_ID:
                return new ActivityNameEditPart(view);
            case SubProcessEditPart.VISUAL_ID:
                return new SubProcessEditPart(view);
            case SubProcessNameEditPart.VISUAL_ID:
                return new SubProcessNameEditPart(view);
            case Activity2EditPart.VISUAL_ID:
                return new Activity2EditPart(view);
            case ActivityName2EditPart.VISUAL_ID:
                return new ActivityName2EditPart(view);
            case TextAnnotationEditPart.VISUAL_ID:
                return new TextAnnotationEditPart(view);
            case TextAnnotationNameEditPart.VISUAL_ID:
                return new TextAnnotationNameEditPart(view);
            case DataObjectEditPart.VISUAL_ID:
                return new DataObjectEditPart(view);
            case DataObjectNameEditPart.VISUAL_ID:
                return new DataObjectNameEditPart(view);
            case GroupEditPart.VISUAL_ID:
                return new GroupEditPart(view);
            case GroupNameEditPart.VISUAL_ID:
                return new GroupNameEditPart(view);
            case LaneEditPart.VISUAL_ID:
                return new LaneEditPart(view);
            case LaneNameEditPart.VISUAL_ID:
                return new LaneNameEditPart(view);
            case PoolPoolCompartmentEditPart.VISUAL_ID:
                return new PoolPoolCompartmentEditPart(view);
            case SubProcessSubProcessBodyCompartmentEditPart.VISUAL_ID:
                return new SubProcessSubProcessBodyCompartmentEditPart(view);
            case SubProcessSubProcessBorderCompartmentEditPart.VISUAL_ID:
                return new SubProcessSubProcessBorderCompartmentEditPart(view);
            case BpmnDiagramEditPart.VISUAL_ID:
                return new BpmnDiagramEditPart(view);
            case SequenceEdgeEditPart.VISUAL_ID:
                return new SequenceEdgeEditPart(view);
            case SequenceEdgeNameEditPart.VISUAL_ID:
                return new SequenceEdgeNameEditPart(view);
            case MessagingEdgeEditPart.VISUAL_ID:
                return new MessagingEdgeEditPart(view);
            case MessagingEdgeNameEditPart.VISUAL_ID:
                return new MessagingEdgeNameEditPart(view);
            case AssociationEditPart.VISUAL_ID:
                return new AssociationEditPart(view);
            }
        }
        return createUnrecognizedEditPart(context, model);
    }
    
    /**
     * Makes sure the custom ConnectionLayerExEx is set
     * so tha the custom connection routers can be used.
     * 
     * @param root The root editpart on which the printable layers are registered
     */
    public static void setupConnectionLayerExEx(DiagramRootEditPart root) {
        LayeredPane printableLayers = (LayeredPane) root
                .getLayer(LayerConstants.PRINTABLE_LAYERS);
        Layer connlayer = 
            printableLayers.getLayer(LayerConstants.CONNECTION_LAYER);
        if (connlayer == null || connlayer instanceof ConnectionLayerExEx) {
            return;
        }
        
        printableLayers.removeLayer(LayerConstants.CONNECTION_LAYER);
        //printableLayers.addLayerAfter(new ConnectionLayerExEx(), 
        //        LayerConstants.CONNECTION_LAYER,
        //        printableLayers.getLayer(DiagramRootEditPart.DECORATION_PRINTABLE_LAYER));
        //for some reason the code above does not replace the connection 
        //layer in the same place where it was.
        //the heavy code below works.
        Layer decorationLayer = printableLayers.getLayer(
                DiagramRootEditPart.DECORATION_PRINTABLE_LAYER);
        printableLayers.removeLayer(DiagramRootEditPart.DECORATION_PRINTABLE_LAYER);
        printableLayers.addLayerBefore(new ConnectionLayerExEx(), 
                LayerConstants.CONNECTION_LAYER,
                printableLayers.getLayer(LayerConstants.PRIMARY_LAYER));
        printableLayers.addLayerBefore(decorationLayer, 
                DiagramRootEditPart.DECORATION_PRINTABLE_LAYER,
                printableLayers.getLayer(LayerConstants.CONNECTION_LAYER));
        
        
        
        FreeformLayer extLabelsLayer = new FreeformLayer();
        extLabelsLayer.setLayoutManager(new DelegatingLayout());
        printableLayers.addLayerAfter(extLabelsLayer,
                BpmnEditPartFactory.EXTERNAL_NODE_LABELS_LAYER,
                LayerConstants.PRIMARY_LAYER);
        LayeredPane scalableLayers = (LayeredPane) root
                .getLayer(LayerConstants.SCALABLE_LAYERS);
        FreeformLayer scaledFeedbackLayer = new FreeformLayer();
        scaledFeedbackLayer.setEnabled(false);
        scalableLayers.addLayerAfter(scaledFeedbackLayer,
                LayerConstants.SCALED_FEEDBACK_LAYER,
                DiagramRootEditPart.DECORATION_UNPRINTABLE_LAYER);

    }
    
//    /**
//     * TO BE REMOVED
//     * @notgenerated support for Note.
//     */
//    public EditPart createEditPart(EditPart context, Object model) {
//        if (model instanceof View) {
//            View view = (View) model;
//            if(ViewType.NOTE.equals(view.getType())
//                    || ViewType.TEXT.equals(view.getType())) {
//                return new TextAnnotationEditPart(view);
//            }
//        }
//        return createEditPartGen(context, model);
//    }

    /**
     * @generated
     */
    private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
        // Handle creation of unrecognized child node EditParts here
        return null;
    }

    /**
     * @generated
     */
    public static CellEditorLocator getTextCellEditorLocator(
            ITextAwareEditPart source) {
        if (source.getFigure() instanceof WrapLabel)
            return new TextCellEditorLocator((WrapLabel) source.getFigure());
        else {
            IFigure figure = source.getFigure();
            return new LabelCellEditorLocator((Label) figure);
        }
    }

    /**
     * @generated
     */
    static private class TextCellEditorLocator implements CellEditorLocator {

        /**
         * @generated
         */
        private WrapLabel wrapLabel;

        /**
         * @generated
         */
        public TextCellEditorLocator(WrapLabel wrapLabel) {
            super();
            this.wrapLabel = wrapLabel;
        }

        /**
         * @generated
         */
        public WrapLabel getWrapLabel() {
            return wrapLabel;
        }

        /**
         * @generated
         */
        public void relocate(CellEditor celleditor) {
            Text text = (Text) celleditor.getControl();
            Rectangle rect = getWrapLabel().getTextBounds().getCopy();
            getWrapLabel().translateToAbsolute(rect);

            if (getWrapLabel().isTextWrapped()
                    && getWrapLabel().getText().length() > 0)
                rect.setSize(new Dimension(text.computeSize(rect.width,
                        SWT.DEFAULT)));
            else {
                int avr = FigureUtilities.getFontMetrics(text.getFont())
                        .getAverageCharWidth();
                rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
                        SWT.DEFAULT)).expand(avr * 2, 0));
            }

            if (!rect.equals(new Rectangle(text.getBounds())))
                text.setBounds(rect.x, rect.y, rect.width, rect.height);
        }

    }

    /**
     * @generated
     */
    private static class LabelCellEditorLocator implements CellEditorLocator {

        /**
         * @generated
         */
        private Label label;

        /**
         * @generated
         */
        public LabelCellEditorLocator(Label label) {
            this.label = label;
        }

        /**
         * @generated
         */
        public Label getLabel() {
            return label;
        }

        /**
         * @generated
         */
        public void relocate(CellEditor celleditor) {
            Text text = (Text) celleditor.getControl();
            Rectangle rect = getLabel().getTextBounds().getCopy();
            getLabel().translateToAbsolute(rect);

            int avr = FigureUtilities.getFontMetrics(text.getFont())
                    .getAverageCharWidth();
            rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
                    SWT.DEFAULT)).expand(avr * 2, 0));

            if (!rect.equals(new Rectangle(text.getBounds())))
                text.setBounds(rect.x, rect.y, rect.width, rect.height);
        }
    }
}
/*******************************************************************************
 * Copyright (c) 2010 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 *******************************************************************************/
package uk.ac.bolton.archimate.editor.preferences;




/**
 * Constant definitions for plug-in preferences
 * 
 * @author Phillip Beauvoir
 */
public interface IPreferenceConstants {
    String USER_DATA_FOLDER = "userDataFolder"; //$NON-NLS-1$
    
    String MRU_MAX = "mruMax"; //$NON-NLS-1$
    
    String GRID_SIZE = "gridSize"; //$NON-NLS-1$
    String GRID_VISIBLE = "gridVisible"; //$NON-NLS-1$
    String GRID_SNAP = "gridSnap"; //$NON-NLS-1$
    String GRID_SHOW_GUIDELINES = "gridShowGuidelines"; //$NON-NLS-1$
    
    String VIEW_TOOLTIPS = "viewTooltips"; //$NON-NLS-1$
    
    String OPEN_DIAGRAMS_ON_LOAD = "openDiagramsOnLoad"; //$NON-NLS-1$
    
    String ANIMATE = "animate"; //$NON-NLS-1$
    String ANIMATION_SPEED = "animationSpeed"; //$NON-NLS-1$
    String ANTI_ALIAS = "antiAlias"; //$NON-NLS-1$
    
    String DEFAULT_VIEW_FONT = "defaultViewFont"; //$NON-NLS-1$
    
    String LINK_VIEW = "linkView"; //$NON-NLS-1$
    
    String BUSINESS_INTERFACE_FIGURE = "businessInterfaceFigure"; //$NON-NLS-1$
    String APPLICATION_COMPONENT_FIGURE = "applicationComponentFigure"; //$NON-NLS-1$
    String APPLICATION_INTERFACE_FIGURE = "applicationInterfaceFigure"; //$NON-NLS-1$
    String TECHNOLOGY_NODE_FIGURE = "technologyNodeFigure"; //$NON-NLS-1$
    String TECHNOLOGY_DEVICE_FIGURE = "technologyDeviceFigure"; //$NON-NLS-1$
    String TECHNOLOGY_INTERFACE_FIGURE = "technologyInterfaceFigure"; //$NON-NLS-1$
    
    String SKETCH_SHOW_BACKGROUND = "sketchShowBackground"; //$NON-NLS-1$
    
    String PALETTE_STATE = "palette_state"; //$NON-NLS-1$

    String ANIMATE_MAGIC_CONNECTOR = "animateMagicConnector"; //$NON-NLS-1$
    String MAGIC_CONNECTOR_POLARITY = "polarityMagicConnector"; //$NON-NLS-1$
    
    String ALLOW_CIRCULAR_CONNECTIONS = "circularConnections"; //$NON-NLS-1$
    
    String USE_NESTED_CONNECTIONS = "useNestedConnections"; //$NON-NLS-1$
    String CREATE_RELATION_WHEN_ADDING_NEW_ELEMENT_TO_CONTAINER = "createRelationWhenAddingNewElementToContainer"; //$NON-NLS-1$
    String CREATE_RELATION_WHEN_ADDING_MODEL_TREE_ELEMENT_TO_CONTAINER = "createRelationWhenAddingModelTreeElementToContainer"; //$NON-NLS-1$
    String CREATE_RELATION_WHEN_MOVING_ELEMENT_TO_CONTAINER = "createRelationWhenMovingElementToContainer"; //$NON-NLS-1$
    
    String NEW_RELATIONS_TYPES = "newRelationsTypes"; //$NON-NLS-1$
    String HIDDEN_RELATIONS_TYPES = "hiddenRelationsTypes"; //$NON-NLS-1$
    
    String VIEWPOINTS_FILTER_MODEL_TREE = "viewpointsFilterModelTree"; //$NON-NLS-1$
    String VIEWPOINTS_HIDE_DIAGRAM_ELEMENTS = "viewpointsHideDiagramElements"; //$NON-NLS-1$
    String VIEWPOINTS_HIDE_PALETTE_ELEMENTS = "viewpointsHidePaletteElements"; //$NON-NLS-1$
    String VIEWPOINTS_HIDE_MAGIC_CONNECTOR_ELEMENTS = "viewpointsHideMagicConnectorElements"; //$NON-NLS-1$

    String EDIT_NAME_ON_NEW_OBJECT = "editNameOnNewObject"; //$NON-NLS-1$
}

package com.mapbox.mapboxsdk.annotationsrework;

import com.mapbox.mapboxsdk.geometry.LatLng;

/**
 * The AnnotationDefinition protocol is used to provide annotation-related information
 * to a map view. To use this protocol, you adopt it in any custom objects that
 * store or represent annotation data. Each object then serves as the source of
 * information about a single map annotation and provides critical information,
 * such as the annotation’s location on the map. AnnotationDefinition objects do not provide
 * the visual representation of the annotation but typically coordinate (in
 * conjunction with the map view’s delegate) the creation of an appropriate
 * objects to handle the display.
 * <p>
 * An object that adopts this protocol must implement the `coordinate` property.
 * </p>
 * <p>
 * The other methods of this protocol are optional.
 * </p>
 */
public interface AnnotationDefinition {

    /**
     * Returns the center point (specified as a map coordinate) of the annotation.
     *
     * @return center point for an annotation
     */
    LatLng getCoordinate();

    /**
     * Returns the title of an annotation.
     * <p>
     * Although this property is optional, if you support the selection of annotations
     * in your map view, you are expected to provide this property. This string is
     * displayed in the {@link com.mapbox.mapboxsdk.annotations.InfoWindow} for the associated annotation.
     * </p>
     *
     * @return title used for an annotation.
     */
    String getTitle();

    /**
     * Returns the snippet of an annotation.
     * <p>
     * This string is displayed in the {@link com.mapbox.mapboxsdk.annotations.InfoWindow} for the associated annotation.
     * <p/>
     *
     * @return snippet used for an annotation and shown in an InfoWindow
     */
    String getSnippet();
}

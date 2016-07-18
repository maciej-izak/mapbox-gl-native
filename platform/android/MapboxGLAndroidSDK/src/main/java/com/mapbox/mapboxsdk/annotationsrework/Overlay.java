package com.mapbox.mapboxsdk.annotationsrework;

import android.graphics.RectF;

import com.mapbox.mapboxsdk.geometry.LatLng;

public interface Overlay extends AnnotationDefinition {

    LatLng getCoordinate();

    void setOverlayBounds(RectF overlayBounds);

    RectF getOverlayBounds();

    boolean intersectOverlayBounds();
}

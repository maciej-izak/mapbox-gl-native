package com.mapbox.mapboxsdk.annotationsrework;

import com.mapbox.mapboxsdk.geometry.LatLng;

import java.util.List;

/**
 * The `MultiPoint` class is an abstract superclass used to define shapes
 * composed of multiple points. You should not create instances of this class
 * directly. Instead, you should create instances of the `Polyline` or
 * `Polygon` classes. However, you can use the method and properties of this
 * class to access information about the specific points associated with the line
 * or polygon.
 */
public abstract class MultiPoint extends Shape {

    private List<LatLng>coordinates;

    public List<LatLng> getCoordinates() {
        return coordinates;
    }

    public int getSize(){
        return coordinates.size();
    }
}

package com.mapbox.mapboxsdk.annotationsrework;

import com.mapbox.mapboxsdk.geometry.LatLng;

import java.util.List;

public class MultiShape extends Shape{

    private List<LatLng> coordinates;

    public List<LatLng> getCoordinates() {
        return coordinates;
    }

    public int getSize(){
        return coordinates.size();
    }
}

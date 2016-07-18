package com.mapbox.mapboxsdk.annotationsrework;

import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapboxMap;

public class Annotation implements AnnotationDefinition {

    private long id = -1;
    private LatLng coordinate;
    private String title;
    private String snippet;
    private MapboxMap mapboxMap;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCoordinate(LatLng coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public LatLng getCoordinate() {
        return coordinate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public MapboxMap getMapboxMap() {
        return mapboxMap;
    }

    public void setMapboxMap(MapboxMap mapboxMap) {
        this.mapboxMap = mapboxMap;
    }
}

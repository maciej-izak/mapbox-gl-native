package com.mapbox.mapboxsdk.annotations;

import java.util.List;

public class MultiPolygon extends Shape{

    private List<Polygon> polygons;

    public MultiPolygon(List<Polygon> polygons) {
        this.polygons = polygons;
    }

    public List<Polygon> getPolygons() {
        return polygons;
    }
}

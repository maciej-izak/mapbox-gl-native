package com.mapbox.mapboxsdk.annotations;

import java.util.List;
import java.util.Map;

public class MultiPolygonFeature extends MultiPolygon implements Feature{
    private long featureId;
    private Map<String, Object> attributes;

    public MultiPolygonFeature(List<Polygon> polygonList) {
        super(polygonList);
    }

    @Override
    public long getFeatureId() {
        return featureId;
    }

    @Override
    public Map<String, Object> getAttributes() {
        return attributes;
    }

    @Override
    public Object getAttribute(String key) {
        return attributes.get(key);
    }
}

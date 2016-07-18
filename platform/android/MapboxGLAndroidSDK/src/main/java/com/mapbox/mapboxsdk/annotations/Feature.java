package com.mapbox.mapboxsdk.annotations;

import java.util.HashMap;

/**
 * Feature is used to provide details about geographic features
 * contained in a map view’s.
 * <p>
 * <a href="https://www.mapbox.com/mapbox-gl-style-spec/#sources">tile sources</a>.
 * Each concrete subclass of `MGLShape` in turn has a subclass that conforms to
 * this protocol.
 * </p>
 * <p>
 * Typically, you do not create feature objects yourself but rather obtain them
 * using `-[MGLMapView visibleFeaturesAtPoint:]` and related methods. Each feature
 * object associates a shape with an identifier and attributes as specified by the
 * source. Like ordinary `MGLAnnotation` objects, some kinds of `MGLFeature`
 * objects can also be added to a map view using `-[MGLMapView addAnnotations:]`
 * and related methods.
 * </p>
 */
public class Feature {

    /**
     * An object that uniquely identifies the feature in its containing
     * <a href="https://www.mapbox.com/mapbox-gl-style-spec/#sources">tile source</a>.
     * <p/>
     * The identifier corresponds to the
     * <a href="https://github.com/mapbox/vector-tile-spec/tree/master/2.1#42-features">feature identifier</a>
     * (`id`) in the tile source. If the source does not specify the feature’s
     * identifier, the value of this property is `nil`. If specified, the identifier
     * may be an integer, floating-point number, or string. These data types are
     * mapped to instances of the following Foundation classes:
     * <p/>
     * <table>
     * <thead>
     * <tr><th>In the tile source</th><th>This property</th></tr>
     * </thead>
     * <tbody>
     * <tr><td>Integer</td>               <td><code>NSNumber</code> (use the <code>unsignedLongLongValue</code> or <code>longLongValue</code> property)</td></tr>
     * <tr><td>Floating-point number</td> <td><code>NSNumber</code> (use the <code>doubleValue</code> property)</td></tr>
     * <tr><td>String</td>                <td><code>NSString</code></td></tr>
     * </tbody>
     * </table>
     * <p/>
     * For details about the identifiers used in most Mapbox-provided styles, consult
     * the
     * <a href="https://www.mapbox.com/vector-tiles/mapbox-streets/">Mapbox Streets</a>
     * layer reference.
     */
    private long id = -1;


    /**
     * A HashMap of attributes for this feature specified by the
     * <a href="https://www.mapbox.com/mapbox-gl-style-spec/#sources">tile source</a>.
     * <p/>
     * The keys and values of this dictionary are determined by the tile source. In
     * the tile source, each attribute name is a string, while each attribute value
     * may be a null value, Boolean value, integer, floating-point number, or string.
     * <p/>
     * <p/>
     * For details about the attribute names and values found in Mapbox-provided
     * vector tile sources, consult the
     * <a href="https://www.mapbox.com/vector-tiles/mapbox-streets/">Mapbox Streets</a>
     * and
     * <a href="https://www.mapbox.com/vector-tiles/mapbox-terrain/">Mapbox Terrain</a>
     * layer references.
     */
    private HashMap<String, Object> attributes = new HashMap<>();

}


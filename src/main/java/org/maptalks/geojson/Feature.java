package org.maptalks.geojson;

import java.util.Map;

public class Feature extends GeoJSON {
    private Object id;
    private Geometry geometry;
    private Map<String, Object> properties;
    
    public Feature(
            Geometry geometry,
            Map<String,Object> properties) {
        this(null, geometry, properties);
    }

    public Feature() {

    }

    public Feature(
            Object id,
            Geometry geometry,
            Map<String,Object> properties) {
        super();
        this.setId(id);
        this.setGeometry(geometry);
        this.setProperties(properties);
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }
}

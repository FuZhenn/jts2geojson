package org.maptalks.geojson;

/**
 * Created by fuzhen on 2015/8/11.
 */
public class GeometryCollection extends Geometry{
    private Geometry[] geometries;

    public GeometryCollection(Geometry[] geometries) {
        super();
        this.setGeometries(geometries);
    }

    public Geometry[] getGeometries() {
        return geometries;
    }

    public void setGeometries(Geometry[] geometries) {
        this.geometries = geometries;
    }
}

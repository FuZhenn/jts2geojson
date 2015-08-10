package org.maptalks.geojson;


public class MultiLineString extends Geometry {
    private double[][][] coordinates;

    public MultiLineString() {
        super();
    }

    public MultiLineString(double [][][] coordinates) {
        super();
        this.setCoordinates(coordinates);
    }

    public double[][][] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[][][] coordinates) {
        this.coordinates = coordinates;
    }
}

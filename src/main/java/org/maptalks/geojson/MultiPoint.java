package org.maptalks.geojson;


public class MultiPoint extends Geometry {
    private double[][] coordinates;

    public MultiPoint() {
        super();
    }

    public MultiPoint( double [][] coordinates) {
        super();
        this.setCoordinates(coordinates);
    }

    public double[][] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[][] coordinates) {
        this.coordinates = coordinates;
    }
}

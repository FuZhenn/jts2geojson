package org.maptalks.geojson;


public class Polygon extends Geometry {
    private double[][][] coordinates;

    public Polygon() {
        super();
    }

    public Polygon(double [][][] coordinates) {
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

package org.maptalks.geojson;


public class Point extends Geometry {
    private double[] coordinates;

    public Point() {
        super();
    }

    public Point(double [] coordinates) {
        super();
        this.setCoordinates(coordinates);
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }
}

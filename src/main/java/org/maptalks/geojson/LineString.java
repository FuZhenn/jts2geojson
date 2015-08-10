package org.maptalks.geojson;

public class LineString extends Geometry {
    private double[][] coordinates;

    public LineString() {
        super();
    }

    public LineString(double [][] coordinates) {
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

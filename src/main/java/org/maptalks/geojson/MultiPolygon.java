package org.maptalks.geojson;


public class MultiPolygon extends Geometry {
    private  double[][][][] coordinates;

    public MultiPolygon() {
        super();
    }

    public MultiPolygon(double [][][][] coordinates) {
        super();
        this.setCoordinates(coordinates);
    }

    public double[][][][] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[][][][] coordinates) {
        this.coordinates = coordinates;
    }
}

package com.module_2.figur;

public abstract class GeometricFigure {

    private String name;
    private double[] coordinateX;
    private double[] coordinateY;

    public GeometricFigure(String name, double[] x, double[] y) {
        this.name = name;
        this.coordinateX = x;
        this.coordinateY = y;
    }

    public abstract double calculateArea(double[] x, double[] y);

    public double[] getCoordinateX() {
        return coordinateX;
    }

    public double[] getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateX(double[] coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(double[] coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

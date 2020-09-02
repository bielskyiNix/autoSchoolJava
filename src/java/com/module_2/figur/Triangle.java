package com.module_2.figur;

public class Triangle extends GeometricFigure {


    public Triangle(String name, double[] x, double[] y) {
        super(name, x, y);
    }

    @Override
    public double calculateArea(double[] x, double[] y) {

        double S;

        S = Math.abs(((x[0] - x[2]) * (y[1]) - y[2]) - (x[1] * (y[0] - y[2]) - x[2] * (y[0] - y[2]))) / 2;


        return S;
    }

}

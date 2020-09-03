package com.module_2.figur;

public class Circle extends GeometricFigure{


    public Circle(String name, double[] x, double[] y) {
        super(name, x, y);
    }

    @Override
    public double calculateArea(double[] x, double[] y) {
         double S;

        S = Math.PI * (Math.pow(x[0] - x[1], 2) + (Math.pow(y[0] - y[1],2)));

        return S;
    }
}

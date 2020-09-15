package com.module_2.figur;

public class Square extends GeometricFigure{


    public Square(String name, double[] x,double[] y) {
        super(name, x, y);
    }

    @Override
    public double calculateArea(double[] x, double[] y) {

        double S = Math.pow((x[0]-x[1]),2);

        return S;
    }
}

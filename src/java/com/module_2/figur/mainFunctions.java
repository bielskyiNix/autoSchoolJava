package com.module_2.figur;

import java.util.*;

public class mainFunctions {

    public static ArrayList<GeometricFigure> createRandomFigures(int numberOfFigures) {

        ArrayList<GeometricFigure> geometricFigureArrayList = new ArrayList<>();

        String circleName = null;
        String triangleName = null;
        String squareName = null;

        int minimumOfCoordinates = 2;


        for (int j = 0; j < numberOfFigures; j++) {

            Random random = new Random();
            int numberOfCoordinates = random.nextInt(2 + 1);
            numberOfCoordinates += minimumOfCoordinates;

            if (numberOfCoordinates == 2) {

                double[] listCircleX = new double[2];
                double[] listCircleY = new double[2];

                for (int i = 0; i < numberOfCoordinates; i++) {
                    listCircleX[i] = random.nextDouble() * 10;
                    listCircleY[i] = random.nextDouble() * 10;
                }

                circleName = "Circle" + j;

                geometricFigureArrayList.add(new Circle(circleName, listCircleX, listCircleY));

            }

            if (numberOfCoordinates == 3) {

                double[] listTriangleX = new double[3];
                double[] listTriangleY = new double[3];

                for (int i = 0; i < numberOfCoordinates; i++) {
                    listTriangleX[i] = random.nextDouble() * 10;
                    listTriangleY[i] = random.nextDouble() * 10;

                }

                triangleName = "Triangle" + j;

                geometricFigureArrayList.add(new Triangle(triangleName, listTriangleX, listTriangleY));


            }

            if (numberOfCoordinates == 4) {

                double[] listSquareX = new double[4];
                double[] listSquareY = new double[4];


                for (int i = 0; i < numberOfCoordinates; i++) {
                    listSquareX[i] = random.nextDouble() * 10;
                    listSquareY[i] = random.nextDouble() * 10;
                }

                squareName = "Square" + j;

                geometricFigureArrayList.add(new Square(squareName, listSquareX, listSquareY));

            }


        }


        //System.out.println("Unsorted list of Geometric Figures");
        //printer(geometricFigureArrayList);
        //System.out.println();

        return geometricFigureArrayList;
    }

    public static void printer(ArrayList<GeometricFigure> list) {

        for (int j = 0; j < 10; j++){
            System.out.println(list.get(j).getName() + ", S = " + list.get(j).calculateArea(list.get(j).getCoordinateX(),list.get(j).getCoordinateY()));
        }
    }

    public static ArrayList<GeometricFigure>  sortingFiguresByArea(ArrayList<GeometricFigure> list){

        boolean sorted = false;
        double figureArea1;
        double figureArea2;
        GeometricFigure temp;

        while (!sorted){
            sorted = true;
            for (int i = 0; i < list.size()-1; i++){
                figureArea1 = list.get(i).calculateArea(list.get(i).getCoordinateX(),
                        list.get(i).getCoordinateY());
                figureArea2 = list.get(i+1).calculateArea(list.get(i+1).getCoordinateX(),
                        list.get(i+1).getCoordinateY());

                if( figureArea1 > figureArea2 ){
                    temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1,temp);
                    sorted = false;
                }
            }
        }
        //System.out.println("Sorted list of Geometric Figures");
        return list;

    }

}


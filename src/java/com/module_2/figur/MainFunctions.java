package com.module_2.figur;

import java.util.*;

public class MainFunctions {

    public static ArrayList<GeometricFigure> createRandomFigures(int numberOfFigures) {

        ArrayList<GeometricFigure> geometricFigureArrayList = new ArrayList<>();

        String figureName;


        int minimumOfCoordinates = 2;


        for (int j = 0; j < numberOfFigures; j++) {

            Random random = new Random();
            int numberOfCoordinates = random.nextInt(2 + 1);
            numberOfCoordinates += minimumOfCoordinates;

            double[] listOfCoordinatesX = new double[numberOfCoordinates];
            double[] listOfCoordinatesY = new double[numberOfCoordinates];

            for (int i = 0; i < numberOfCoordinates; i++) {
                listOfCoordinatesX[i] = random.nextDouble() * 10;
                listOfCoordinatesY[i] = random.nextDouble() * 10;
            }

            if (numberOfCoordinates == 2) {

                figureName = "Circle" + j;

                geometricFigureArrayList.add(new Circle(figureName, listOfCoordinatesX, listOfCoordinatesY));

            }

            if (numberOfCoordinates == 3) {

                figureName = "Triangle" + j;

                geometricFigureArrayList.add(new Triangle(figureName, listOfCoordinatesX, listOfCoordinatesY));


            }

            if (numberOfCoordinates == 4) {

                figureName = "Square" + j;

                geometricFigureArrayList.add(new Square(figureName, listOfCoordinatesX, listOfCoordinatesY));

            }


        }

        /*
        System.out.println("Unsorted list of Geometric Figures");
        printer(geometricFigureArrayList);
        */
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

        return list;

    }

}


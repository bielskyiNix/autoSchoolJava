package com.module1.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask3 {

    static String[] list = new String[10];
    static int[] numbers = new int[10];

    public static String[] readLines() throws IOException {

        System.out.println("Enter list of strings:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < list.length; i++) {

            list[i] = reader.readLine();

        }

        return list;

    }

    public static int[] returnNumbersList(String[] list) {

        for(int i = 0; i < list.length; i++){

            numbers[i] = list[i].length();

        }
        return numbers;
    }

    public static void printNumbers(int[] list){

        for (int i = 0; i<list.length; i++){

            System.out.println(list[i]);

        }
    }
}

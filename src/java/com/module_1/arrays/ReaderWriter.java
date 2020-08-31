package com.module_1.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderWriter {

    public static String[] readStrings(int listLength) throws IOException {

        String[] list = new String[listLength];

        System.out.println("Enter list of strings:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < list.length; i++) {

            list[i] = reader.readLine();

        }

        return list;

    }

    public static int[] readIntegers(int listLength) throws IOException {

        int[] numbers = new int[listLength];

        System.out.println("Enter list of numbers:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = Integer.parseInt(reader.readLine());

        }

        return numbers;

    }

    public static void printList(int[] list){

        for (int i = 0; i<list.length; i++){

            System.out.println(list[i]);

        }
    }

    public static void printList(String[] list){

        for (int i = 0; i<list.length; i++){

            System.out.println(list[i]);

        }
    }


}

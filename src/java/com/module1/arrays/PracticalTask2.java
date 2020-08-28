package com.module1.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask2 {

    public static String[] readLines() throws IOException {

        System.out.println("Enter list of strings:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] list = new String[10];

        for (int i = 0; i < list.length; i++) {

            list[i] = reader.readLine();

        }

        return list;

    }

    public static void invertedArray(String[] list){

        System.out.println("Inverted list of strings:");

        for (int i = list.length-1; i >= 0; i--) {

            System.out.println(list[i]);

        }
    }
}

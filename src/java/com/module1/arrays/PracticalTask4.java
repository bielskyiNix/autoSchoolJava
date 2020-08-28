package com.module1.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PracticalTask4 {

    static int[] numbers = new int[10];

    public static int[] readLines() throws IOException {

        System.out.println("Enter list of numbers:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = Integer.parseInt(reader.readLine());

        }

        return numbers;

    }

    public static int[] reversedArray(int[] list){

        int k = list.length - 1;
        int temp = 0;

        for(int i = 0; i < list.length/2; i++){

            temp = list[i];
            list[i] = list[k - i];
            list[k - i] = temp;

        }

        return list;

    }

}

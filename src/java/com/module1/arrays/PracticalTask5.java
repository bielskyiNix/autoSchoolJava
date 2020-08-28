package com.module1.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask5 {

    static int[] numbers = new int[20];
    static int[] list1 = new int[10];
    static int[] list2 = new int[10];

    public static int[] readLines() throws IOException {

        System.out.println("Enter list of numbers:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = Integer.parseInt(reader.readLine());

        }

        return numbers;

    }

    public static int[] twoArrays(int[] list){

        System.arraycopy(list,0,list1,0,10);
        System.arraycopy(list,10,list2,0,10);

        return list2;
    }
}

package com.module1.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask1 {

    public static int[] initializeArray() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[20];

        for (int i = 0; i < list.length; i++) {

            list[i] = Integer.parseInt(reader.readLine());

        }

        return list;
    }

    public static void Max(int[] array){

        int max = array[0];

        for (int i=0; i< array.length; i++){

            if (max < array[i]){

                max = array[i];

            }

        }

        System.out.println("Max=" + max);

    }
}

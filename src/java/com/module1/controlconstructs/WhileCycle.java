package com.module1.controlconstructs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileCycle {

    public static void while10(String direction) {
        if (direction.equals("A")) {
            int i = 0;
            while (i < 11) {
                System.out.println(i);
                i++;
            }
        } else if (direction.equals("D")) {
            int i = 10;
            while (i > 0) {
                System.out.println(i);
                i--;
            }
        }
    }

    public static void stringXNumber() throws IOException {

        String userString;
        int number;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите строку: ");
        userString = reader.readLine();

        System.out.print("Введите число: ");
        number = Integer.parseInt(reader.readLine());

        int i = 0;
        while (i < number) {

            System.out.println(userString);
            i++;
        }

    }

    public static void letterCube() {
        String n = "S";
        int j;
        int i = 0;
        while (i < 10) {
            j = 0;
            while (j < 10) {

                System.out.print(n);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void multiplicationTable(){
        int i = 1;
        int j = 0;
        while (i <= 10) {
            j = 1;
            while (j <= 10) {
                System.out.print(i * j +  " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}

package com.module_1.control_constructs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForCycle {

    public static void for10(){

        for (int i = 1; i < 101; i++){

            if(i%2 == 0){

                System.out.print(i + " ");

            }

        }
        System.out.println();

    }

    public static void rectangle() throws IOException {

        int m;
        int n;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число m: ");
        m = Integer.parseInt(reader.readLine());

        System.out.print("Введите число n: ");
        n = Integer.parseInt(reader.readLine());

        for(int i = 0; i < m ; i++){

            for (int j = 0; j < n; j++){

                System.out.print("8");


            }
            System.out.println();
        }

    }

    public static void triangle(){

        for(int i = 1; i <= 10; i++){

            for (int j = 0; j < i; j++){

                System.out.print(8);

            }
            System.out.println();
        }

    }

    public static void lines(char type){

        if (type == 'h')

            for(int i = 0; i < 10 ; i++){

                System.out.print("8");


            }

        else if (type == 'v'){

            for(int i = 0; i < 10 ; i++){

                System.out.println("8");

            }

        }

    }

    public static void personLoveMe() throws IOException {

        String userString;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите имя: ");
        userString = reader.readLine();

        for(int i = 0; i < 10 ; i++){

            System.out.println(userString + " любит меня");

        }

    }

    public static void explosion() throws InterruptedException {

        for(int i = 30; i >= 0 ; i--){

            System.out.println(i);
            Thread.sleep(100);
            if (i == 0) System.out.print("Бум!");
        }


    }

}


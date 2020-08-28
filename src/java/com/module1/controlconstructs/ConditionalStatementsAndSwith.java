package com.module1.controlconstructs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ConditionalStatementsAndSwith {


    public static void twoNumbers() throws IOException {

        int[] list = new int[2];

        System.out.println("Enter two numbers:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < list.length; i++) {

            list[i] = Integer.parseInt(reader.readLine());

        }

        if (list[0] > list[1]){

            System.out.println("The largest number is " + list[0]);

        }
        else if (list[0] == list[1]){

            System.out.println("numbers are equal");

        } else {

            System.out.println("The largest number is "+ list[1]);

        }
    }

    public static void fourNumbers() throws IOException {

        int[] list = new int[4];

        System.out.println("Enter four numbers:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < list.length; i++) {

            list[i] = Integer.parseInt(reader.readLine());

        }

        if (list[0] > list[1] && list[0] > list[2] && list[0] > list[3]){

            System.out.println("The largest number is " + list[0]);

        }
        else if (list[1] > list[2] && list[1] > list[3]) {

            System.out.println("The largest number is " + list[1]);

        }
        else if(list[2] > list[3]){

            System.out.println("The largest number is " + list[2]);

        }
        else if (list[0] == list[1] && list[1]== list[2] && list[2] == list[3]) {

            System.out.println("numbers are equal");

        } else {

            System.out.println("The largest number is "+ list[3]);

        }
    }

    public static void threeNumbers() throws IOException {

        int[] list = new int[3];
        int temp;

        System.out.println("Enter three numbers:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < list.length; i++) {

            list[i] = Integer.parseInt(reader.readLine());

        }

        for(int i = list.length - 1; i >= 1 ; i--){

            for (int j = 0; j < list.length - 1; j++){

                if (list[j+1] > list[j]){

                    temp = list[j];
                    list[j] = list [j+1];
                    list[j+1] = temp;

                }

            }
        }


        for (int i = 0; i < list.length; i++){

            System.out.println(list[i]);

        }

    }

    public static void Names() throws IOException {

        String[] list = new String[2];

        System.out.println("Введите два имени");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < list.length; i++) {

            list[i] = reader.readLine();

        }

        if (list[0].equals(list[1])){

            System.out.println("Имена идентичны");

        } else if (list[0].length() == list[1].length()) {

            System.out.println("Длины имен равны");

        } else {

            System.out.println("Странные имена не так ли?");

        }

    }

    public static void nameAndAge() throws IOException{

        String name;
        int age;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите имя: ");
        name = reader.readLine();

        System.out.print("Введите возраст: ");
        age = Integer.parseInt(reader.readLine());

        if (age < 18) {
            System.out.println("Подрасти еще");
        } else if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }

    }

    public static void gamewithNumbers() throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int secret = random.nextInt(20 + 1);
        int number;

        for(int i = 1; i < 8; i++){

            System.out.print("Введите число: ");
            number = Integer.parseInt(reader.readLine());
            if (secret == number){
                System.out.println("Угадал :)");
                break;
            } else if (i == 7 && (secret > number || secret < number)) {
                System.out.println("Не угадал :(");
                System.out.println("Пока!");
            } else if (secret < number) {
                System.out.println("Много!");
                continue;
            } else if (secret > number) {
                System.out.println("Мало!");
                continue;
            }
        }

    }

}


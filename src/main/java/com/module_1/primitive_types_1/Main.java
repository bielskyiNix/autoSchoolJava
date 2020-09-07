package com.module_1.primitive_types_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        helloName2();
    }

    static void helloName(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = in.nextLine();
        System.out.println("Hello " + name + "!");
    }

     static void helloName2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name:");
        String name = reader.readLine();
        System.out.println("Hello " + name + "!");
    }

}
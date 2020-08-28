package com.module1.primitivetypes2.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {
    private static String name;
    String name1;

    public static void readName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name:");
        String name2 = reader.readLine();
        setupName(name2);
    }

    public static void setupName(String name1) throws IOException {
        name = name1;
    }

    public static String getName() {
        return name;
    }

    public static void welcome() {
        System.out.println("Hello " + name + "!");
    }

    public static void byeBye(){
        System.out.println("Bye " + name + "!");
    }

}

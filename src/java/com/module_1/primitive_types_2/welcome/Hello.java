package com.module_1.primitive_types_2.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

    private static String name;

    public static String readName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name:");
        String userName = reader.readLine();
        return setupName(userName);
    }

    public static String setupName(String name1) throws IOException {
        name = name1;
        return name;
    }


    public static void welcome(String name2) {
        System.out.println("Hello " + name2 + "!");
    }

    public static void byeBye(String name3){
        System.out.println("Bye " + name3 + "!");
    }

}

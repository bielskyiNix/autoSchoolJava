package com.module1.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask2 {

    static String userString;
    static String userSubstring;
    static String newSubstring;

    public static void readString() throws IOException {

        System.out.print("Enter string: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        userString = reader.readLine();

    }

    public static void readSubstring() throws IOException {

        System.out.print("Enter substring: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        userSubstring = reader.readLine();

    }

    public static void readNewSubstring() throws IOException {

        System.out.print("Enter new substring: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        newSubstring = reader.readLine();

    }


    public static void findAndReplaceSubstring(){

        if (userString.contains(userSubstring)){

            System.out.println(userString.replace(userSubstring,newSubstring));

        }
        else{

            System.out.println("This string does not have such substring");

        }

    }

}

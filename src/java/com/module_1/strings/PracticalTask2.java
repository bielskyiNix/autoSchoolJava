package com.module_1.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask2 {


    public static String readString() throws IOException {

        System.out.print("Enter string: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userString = reader.readLine();
        return userString;

    }

    public static String readSubstring() throws IOException {

        System.out.print("Enter substring: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userSubstring = reader.readLine();
        return userSubstring;

    }

    public static String readNewSubstring() throws IOException {

        System.out.print("Enter new substring: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String newSubstring = reader.readLine();
        return newSubstring;

    }


    public static void findAndReplaceSubstring(String userString, String userSubstring, String newSubstring){

        if (userString.contains(userSubstring)){

            System.out.println(userString.replace(userSubstring,newSubstring));

        }
        else{

            System.out.println("This string does not have such substring");

        }

    }

}

package com.module_1.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask1 {

    public static void readLineandPerformActions() throws IOException {

        System.out.print("Enter string: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String newString = reader.readLine();

        firstMiddleLastsymbols(newString);
        numberOfSymbol(newString, ' ');
        substringToDot(newString);

    }

    public static void firstMiddleLastsymbols(String newString){

        System.out.println("First symbol:" + newString.charAt(0));
        System.out.println("Last symbol:" + newString.charAt(newString.length()-1));

        if (newString.length()%2 == 1){
            System.out.println("The symbol in the middle:" + newString.charAt(newString.length()/2));
        }
        else {
            System.out.println("Even number of characters per line");
        }

    }

    public static void numberOfSymbol(String newString,char Symbol){

        char[] newStringList = newString.toCharArray();
        int count = 0;

        for(int i = 0; i < newStringList.length; i++){
            if(newStringList[i] == Symbol){
                count++;
            }
        }

        System.out.println("Number of Symbol" + Symbol + ": " + count);

    }

    public static void substringToDot(String newString){

        if (newString.contains(".")) {

            System.out.println("Substring to the first dot: " + newString.substring(0, newString.indexOf(".")+1));

        } else {

            System.out.println("This string is without dot: " + newString );

        }
    }
}
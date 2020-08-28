package com.module1.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask3 {


    static String userWords;

    public static void readWords() throws IOException {

        System.out.print("Enter words: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        userWords = reader.readLine();

    }

    public static void longestWord() {

        String longestWord = null;
        int min = 0;

        String[] words = userWords.split(" ");

        if (words.length == 1) {

            System.out.println("The longest word: " + words[0]);

        } else {

            for (int i = 0; i < words.length; i++) {

                if (min < words[i].length()) {

                    min = words[i].length();
                    longestWord = words[i];

                }

            }

            System.out.println("The longest word: " + longestWord);

        }
    }
}
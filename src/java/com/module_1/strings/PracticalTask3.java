package com.module_1.strings;

public class PracticalTask3 {


    public static void longestWord(String userWords) {

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
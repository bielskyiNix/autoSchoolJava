package com.module1.strings;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Practical Task 1");
        PracticalTask1.readLine();
        PracticalTask1.firstMiddleLastsymbols();
        PracticalTask1.numberOfSymbol(' ');
        PracticalTask1.substringToDot();

        System.out.println("Practical Task 2");
        PracticalTask2.readString();
        PracticalTask2.readSubstring();
        PracticalTask2.readNewSubstring();
        PracticalTask2.findAndReplaceSubstring();

        System.out.println("Practical Task 3");
        PracticalTask3.readWords();
        PracticalTask3.longestWord();

    }
}


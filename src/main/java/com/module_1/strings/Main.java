package com.module_1.strings;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Practical Task 1");
        PracticalTask1.readLineandPerformActions();

        System.out.println("Practical Task 2");
        PracticalTask2.findAndReplaceSubstring(PracticalTask2.readString(), PracticalTask2.readSubstring(), PracticalTask2.readNewSubstring());

        System.out.println("Practical Task 3");
        PracticalTask3.longestWord(PracticalTask2.readString());

    }
}


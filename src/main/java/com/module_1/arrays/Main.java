package com.module_1.arrays;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Practical Task 1");
        PracticalTasks.Max(ReaderWriter.readIntegers(20));

        System.out.println("Practical Task 2");
        PracticalTasks.invertedArray(ReaderWriter.readStrings(10));

        System.out.println("Practical Task 3");
        ReaderWriter.printList(PracticalTasks.returnNumbersList(ReaderWriter.readStrings(10)));

        System.out.println("Practical Task 4");
        ReaderWriter.printList(PracticalTasks.reversedArray(ReaderWriter.readIntegers(10)));

        System.out.println("Practical Task 5");
        ReaderWriter.printList(PracticalTasks.twoArrays(ReaderWriter.readIntegers(20)));

    }
}

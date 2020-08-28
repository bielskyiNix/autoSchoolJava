package com.module1.arrays;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //System.out.println("Practical Task 1");
        //PracticalTask1.Max(PracticalTask1.initializeArray());

        System.out.println("Practical Task 2");
        PracticalTask2.invertedArray(PracticalTask2.readLines());

        System.out.println("Practical Task 3");
        PracticalTask3.printNumbers(PracticalTask3.returnNumbersList(PracticalTask3.readLines()));

        System.out.println("Practical Task 4");
        PracticalTask3.printNumbers(PracticalTask4.reversedArray(PracticalTask4.readLines()));

        System.out.println("Practical Task 5");
        PracticalTask3.printNumbers(PracticalTask5.twoArrays(PracticalTask5.readLines()));
    }
}

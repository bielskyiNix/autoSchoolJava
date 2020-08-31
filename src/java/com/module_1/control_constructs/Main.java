package com.module_1.control_constructs;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Practical tasks 1 - 7");
        ConditionalStatementsAndSwith.twoNumbers();
        ConditionalStatementsAndSwith.fourNumbers();
        ConditionalStatementsAndSwith.threeNumbers();
        ConditionalStatementsAndSwith.names();
        ConditionalStatementsAndSwith.nameAndAge();
        ConditionalStatementsAndSwith.gamewithNumbers();

        System.out.println("Practical tasks 8 - 12");
        WhileCycle.while10("D"); // A = Ascending, D = Descending
        WhileCycle.stringXNumber();
         WhileCycle.letterCube();
        WhileCycle.multiplicationTable();

        System.out.println("Practical tasks 13 - 18");
        ForCycle.for10();
        ForCycle.rectangle();
        ForCycle.triangle();
        ForCycle.lines('v'); //h - horizontal, v - vertical
        ForCycle.personLoveMe();
        ForCycle.explosion();
    }
}

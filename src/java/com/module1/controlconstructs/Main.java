package com.module1.controlconstructs;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        ConditionalStatementsAndSwith.twoNumbers();
        ConditionalStatementsAndSwith.fourNumbers();
        ConditionalStatementsAndSwith.threeNumbers();
        ConditionalStatementsAndSwith.Names();
        ConditionalStatementsAndSwith.nameAndAge();
        ConditionalStatementsAndSwith.gamewithNumbers();
        WhileCycle.while10("D"); // A = Ascending, D = Descending
        WhileCycle.stringXNumber();
        WhileCycle.letterCube();
        WhileCycle.multiplicationTable();
        ForCycle.for10();
        ForCycle.rectangle();
        ForCycle.triangle();
        ForCycle.lines('v'); //h - horizontal, v - vertical
        ForCycle.personLoveMe();
        ForCycle.explosion();
    }
}

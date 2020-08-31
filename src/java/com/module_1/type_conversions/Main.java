package com.module_1.type_conversions;

public class Main {

    public static void main(String[] args) {
        practicalTask1(30,14);
        practicalTask2(77);
        practicalTask3(5.9);
        practicalTask4(10,15,47);
    }

    public static void practicalTask1(int q,int w){
        int devisionResult = q / w;
        int remainderFromDivision = q % w;
        System.out.println("The result from division: " + devisionResult + " and remainder from division: " + remainderFromDivision );
    }

    public static void practicalTask2(int n){
        int k = (int)n/10 + (n - ((int)n/10)*10);
        System.out.println("Sum " + k);
    }

    public static void practicalTask3(double n){
        int round = (int) (n + 0.5);
        System.out.println("Rounded number " + round);
    }


    public static void practicalTask4(int a, int b, int c) {

        a += b;
        System.out.println("a = " + a);
        b = c - (a - b);
        System.out.println("b = " + b);
        c += a;
        System.out.println("c = " + c);

    }
}

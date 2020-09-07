package com.module_3.exception_task;

public class ClassWithThrows {

    public static void main(String[] args) throws InterruptedException {
        practicalTask1(30,14);
        practicalTask2(77);
        practicalTask3(5.9);
        practicalTask4(10,15,47);

    }

    public static void practicalTask1(int q,int w){
        try{
            int divisionResult = q / w;
            int zero = 5/0;
            int remainderFromDivision = q % w;
            System.out.println("The result from division: " + divisionResult + " and remainder from division: " + remainderFromDivision );
        }
        catch (ArithmeticException e){
            System.out.println("You shall not fall!");
        }
    }

    public static void practicalTask2(int n) throws InterruptedException {

        int k = n / 10 + ( n - ( n / 10 ) * 10);
        System.out.println("Sum " + k);
        Thread.sleep(3000);

    }

    public static void practicalTask3(double n) {

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

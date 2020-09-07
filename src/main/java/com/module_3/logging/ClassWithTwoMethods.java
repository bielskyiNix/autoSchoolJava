package com.module_3.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ClassWithTwoMethods {

    static final Logger classWithTwoMethods = LogManager.getLogger(ClassWithTwoMethods.class.getName());

    private void privateMethod(){

        classWithTwoMethods.info("Method execution start");
        System.out.println("Private method execution completed");
        int zero = 5/0;
        classWithTwoMethods.info("Method execution end");

    }

    public void publicMethod() {

        try {
            privateMethod();
        }
        catch (ArithmeticException e){

            classWithTwoMethods.warn(e.toString());

        } finally {
            classWithTwoMethods.info("Method execution start");
            System.out.println("Public method execution completed");
            classWithTwoMethods.info("Method execution end");
        }

    }

}

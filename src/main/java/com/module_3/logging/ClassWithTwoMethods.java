package com.module_3.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ClassWithTwoMethods {

    static final Logger classWithTwoMethodsLogger = LogManager.getLogger(ClassWithTwoMethods.class.getName());

    private void privateMethod(){

        try {

            classWithTwoMethodsLogger.info("privateMethod execution start");

            System.out.println("Private method execution completed");
            int zero = 5/0;

            classWithTwoMethodsLogger.info("privateMethod execution end");

        }
        catch (ArithmeticException e){

            classWithTwoMethodsLogger.error(e.toString());

        }
    }

    public void publicMethod() {

        classWithTwoMethodsLogger.info("publicMethod execution start");

        privateMethod();

        System.out.println("Public method execution completed");

        classWithTwoMethodsLogger.info("publicMethod execution end");


    }

}

package com.module_1.primitive_types_2.company;

import com.module_1.primitive_types_2.welcome.Hello;
import java.io.IOException;



public class Main {

    public static void main(String[] args) throws IOException {

        Hello first_object = new Hello();

        first_object.readName();
        first_object.welcome(); // Greet the person
        System.out.println("Hello world!"); // Displays text "Hello world!"
        first_object.byeBye(); // Say goodbye to the person
    }
}

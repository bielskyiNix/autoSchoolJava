package com.module_1.primitive_types_2.company;

import com.module_1.primitive_types_2.welcome.Hello;
import static com.module_1.primitive_types_2.welcome.Hello.readName;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        Hello.welcome(Hello.readName()); // Greet the person
        System.out.println("Hello world!"); // Displays text "Hello world!"
        Hello.byeBye(Hello.readName()); // Say goodbye to the personD
    }
}

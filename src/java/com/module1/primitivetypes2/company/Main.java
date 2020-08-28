package com.module1.primitivetypes2.company;

import com.module1.primitivetypes2.welcome.Hello;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Hello.readName(); // Read person's name from console
        Hello.welcome(); // Greet the person
        System.out.println("Hello world!"); // Displays text "Hello world!"
        Hello.byeBye(); // Say goodbye to the personD
    }
}

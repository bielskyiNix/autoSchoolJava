package com.module_1.primitive_types_2.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

    private String name;

    public void readName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             System.out.print("Enter your name:");
        String userName = reader.readLine();
        setupName(userName);
    }

    public void setupName(String name){
        this.name = name;
    }


    public void welcome() {
        System.out.println("Hello " + name + "!");
    }

    public void byeBye(){
        System.out.println("Bye " + name + "!");
    }

}

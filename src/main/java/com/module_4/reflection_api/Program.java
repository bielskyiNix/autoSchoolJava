package com.module_4.reflection_api;

import java.lang.reflect.Field;


public class Program {

    public static <T> void setValues(T object) throws IllegalAccessException {


        Field[] field = object.getClass().getDeclaredFields();
        for(int i = 0; i < field.length; i++ ){
            field[i].setAccessible(true);
            field[i].set(object,"ObjectName "+i);
        }

    }

}


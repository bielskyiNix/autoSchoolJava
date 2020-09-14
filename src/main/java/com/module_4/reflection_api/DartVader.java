package com.module_4.reflection_api;

import java.lang.reflect.Field;

public class DartVader {

    public static void main(String[] args) throws IllegalAccessException {

        DartVader[] objArray ={ new Lea(),new Luke() };
        for(int i = 0; i < objArray.length; i++){
            Program.setValues(objArray[i]);
            printerFieldNameAndFieldValue(objArray[i]);
        }

    }

    public static <T extends DartVader> void printerFieldNameAndFieldValue(T object) throws IllegalAccessException {


        Field[] field = object.getClass().getDeclaredFields();
        for(int i = 0; i < field.length; i++ ){
            field[i].setAccessible(true);
            System.out.println(String.format("Field \"%s\" value: ",field[i].getName())+field[i].get(object));
        }

    }
}

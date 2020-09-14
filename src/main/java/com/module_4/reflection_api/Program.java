package com.module_4.reflection_api;

import java.lang.reflect.Field;
import java.util.Random;


public class Program {

    public static <T> void setValues(T object) throws IllegalAccessException {


        Field[] field = object.getClass().getDeclaredFields();
        for(int i = 0; i < field.length; i++ ){
            field[i].setAccessible(true);
            field[i].set(object,generateRandomString(10));
        }

    }

    public static String generateRandomString(int stringLength) {

        // elements from 0 to z (0-9, A-Z, a-z and :,;,<,=,>,?,@,[,\,],^,_,`)
        // 48-57 = 0-9 , 58-64 = :,;,<,=,>,?,@ , 65-90 = A-Z , 91-96 [,\,],^,_,` , 97-122 = a-z
        int leftLimit = 48; // number '0'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();

        // буду честен нашел вариант генерации рандомной строки в инете) и немного отредактировал) и вроде разобрался в чем суть)
        String generatedString = random.ints(stringLength, leftLimit, rightLimit + 1)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

}


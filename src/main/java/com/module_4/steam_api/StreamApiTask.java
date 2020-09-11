package com.module_4.steam_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamApiTask {

    public static void streamTasks(List<String> stringList) {

        System.out.println(stringList.size());
        System.out.println("Длинна каждого из элементов списка:");
        stringList.stream().mapToInt(stringLength -> stringLength.length()).forEach(System.out::println);
        System.out.println("Не пустые элементы списка не содержащие символ:");
        stringList.stream().filter(x -> !x.contains("d")).filter(x -> !x.isEmpty()).forEach(System.out::println);
        System.out.println("Элементы списка в алфавитном порядке:");
        stringList.stream().sorted().forEach(System.out::println);

    }

    public static List<String> generatorRandomStringsList() {

        List<String> stringList = new ArrayList<>();
        Random random = new Random();
        boolean addLetterD;
        int stringListSize = 50 + random.nextInt(50); // 50 is minimum required size of List

        while (stringList.size() < stringListSize) {

            addLetterD = random.nextBoolean();

            if (addLetterD) {

                stringList.add("String" + " ddd " + stringList.size());

            } else {

                stringList.add("Test String " + stringList.size());

            }
        }

        stringList.add(""); //from task requirements :"Добавьте вручную несколько пустых элементов"
        stringList.add("");

        return stringList;
    }
}
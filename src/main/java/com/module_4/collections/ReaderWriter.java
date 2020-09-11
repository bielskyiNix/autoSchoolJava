package com.module_4.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReaderWriter {

    public static List<String> readUsersStrings(int listLength) throws IOException {

        List<String> list = new ArrayList<>();

        System.out.println(String.format("Enter %s strings:",listLength));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < listLength; i++) {

            list.add(reader.readLine());

        }

        return list;

    }

    public static void printMap(Map<?, ?> hashMap, String valueToPrint){

        if (valueToPrint == "key-value"){

            for (Map.Entry entry: hashMap.entrySet()){

                System.out.println(entry.getKey() + " - " + entry.getValue());

            }
        }

        if (valueToPrint == "key"){

            for (Map.Entry entry: hashMap.entrySet()){

                System.out.println(entry.getKey());

            }

        }

        if (valueToPrint == "value"){

            for (Map.Entry entry: hashMap.entrySet()){

                System.out.println(entry.getValue());

            }

        }
    }

    public static void printerList(Set<?> hashSet, boolean printSize){

        if(printSize) System.out.println("Set size = " + hashSet.size());

        hashSet.forEach(System.out::println);

    }

    public static void printerList(List<String> listToPrint, boolean printSize){

        if(printSize) System.out.println("List size = " + listToPrint.size());

        listToPrint.forEach(System.out::println);
    }

}

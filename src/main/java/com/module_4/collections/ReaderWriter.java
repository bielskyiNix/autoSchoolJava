package com.module_4.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReaderWriter {

    public static ArrayList<String> readUsersStrings(int listLength) throws IOException {

        ArrayList<String> list = new ArrayList<>();

        System.out.println(String.format("Enter %s strings:",listLength));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < listLength; i++) {

            list.add(reader.readLine());

        }

        return list;

    }


    public static void printerList(Set<?> hashSet){

        for (Object text : hashSet){

            System.out.println(text);

        }

    }

    public static void printHashMap(Map<String, ?> hashMap, String valueToPrint){

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

    public static void printerList(ArrayList<String> arrayList, boolean printSize){

        if(printSize) System.out.println("ArrayList size = " + arrayList.size());

        for(String arrayListValue: arrayList){

            System.out.println(arrayListValue);

        }
    }

}

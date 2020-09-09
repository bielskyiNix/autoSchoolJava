package com.module_4.collections;

import java.util.ArrayList;

public class ArrayListTasks {

    public static ArrayList<String> findLargestOrSmallestString(ArrayList<String> arrayList, String wordSize) {
        ArrayList<String> stringsArrayList = new ArrayList<>();
        stringsArrayList.add(arrayList.get(0));
        if(wordSize == "largest"){
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).length() > stringsArrayList.get(0).length()) {
                    stringsArrayList.clear();
                    stringsArrayList.add(arrayList.get(i));
                }
                else if (arrayList.get(i).length() == stringsArrayList.get(0).length()){
                    stringsArrayList.add(arrayList.get(i));
                }
            }
        }
        else if(wordSize == "smallest"){
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).length() < stringsArrayList.get(0).length()) {
                    stringsArrayList.clear();
                    stringsArrayList.add(arrayList.get(i));
                }
                else if (arrayList.get(i).length() == stringsArrayList.get(0).length()){
                    stringsArrayList.add(arrayList.get(i));
                }
            }
        }

        return stringsArrayList;
    }


    public static ArrayList<String> addRemoveLastElement(ArrayList<String> arrayList){

        for(int i = 0; i < 13; i++) {
            arrayList.add(0, String.valueOf(arrayList.size()));
            arrayList.remove(arrayList.size()-1);
        }
        return arrayList;
    }

    public static ArrayList<String> addListToBeginning(ArrayList<String> createdList,ArrayList<String> usersList){

        for (int i = usersList.size()-1; i>=0; i--){
            createdList.add(0, usersList.get(i));
        }
        return createdList;
    }


}
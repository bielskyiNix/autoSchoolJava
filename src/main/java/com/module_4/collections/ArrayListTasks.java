package com.module_4.collections;

import java.util.*;

public class ArrayListTasks {

    public static List<String> findLargestOrSmallestString(List<String> usersList, String wordSize) {
        List<String> stringsArrayList = new ArrayList<>();
        if(wordSize == "largest"){
            for (int i = 0; i < usersList.size(); i++) {
                if (usersList.get(i).length() > stringsArrayList.get(0).length()) {
                    stringsArrayList.clear();
                    stringsArrayList.add(usersList.get(i));
                }
                else if (usersList.get(i).length() == stringsArrayList.get(0).length()){
                    stringsArrayList.add(usersList.get(i));
                }
            }
        }
        else if(wordSize == "smallest"){
            for (int i = 0; i < usersList.size(); i++) {
                if (stringsArrayList.isEmpty() || usersList.get(i).length() < stringsArrayList.get(0).length()) {
                    stringsArrayList.clear();
                    stringsArrayList.add(usersList.get(i));
                }
                else if (usersList.get(i).length() == stringsArrayList.get(0).length()){
                    stringsArrayList.add(usersList.get(i));
                }
            }
        }

        return stringsArrayList;
    }


    public static List<String> addRemoveLastElement(List<String> list){

        for(int i = 0; i < 13; i++) {
            list.add(0, list.get(list.size()-1));
            list.remove(list.size()-1);
        }
        return list;
    }

    public static List<String> addListToBeginning(List<String> createdList,List<String> usersList){

        for (int i = usersList.size()-1; i>=0; i--){
            createdList.add(0, usersList.get(i));
        }
        return createdList;
    }


}
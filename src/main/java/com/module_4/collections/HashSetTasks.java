package com.module_4.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class HashSetTasks {

    String[] plantName = new String[]{"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
    String[] plantType = new String[]{"ягода", "трава", "ягода", "фрукт",  "овощ", "куст", "корень", "ягода", "цветок", "клубень" };

    public HashSet<String> plants(){

        HashSet<String> plantsHashSet= new HashSet<String>();
        Collections.addAll(plantsHashSet,plantName);

        return plantsHashSet;
    }

    public HashMap<String,String> plantsAndType(){

        HashMap<String,String> plantsHashMap = new HashMap<String, String>();
        for(int i=0; i<plantType.length; i++){
            plantsHashMap.put(plantName[i],plantType[i]);
        }

        return plantsHashMap;
    }

    public HashMap<String, Cat> catsCreation(){

        HashMap<String,Cat> cats = new HashMap<String, Cat>();
        for (int i=0; i<10; i++){
            Cat newCat = new Cat("Name"+i);
            cats.put(newCat.getName(),newCat);
        }
        return cats;
    }

    public HashMap<String,Object> hashMapForPrint(){

        HashMap<String,Object> obj = new HashMap<String, Object>();
        for (int i=0; i<10; i++){
            Object newObj = new String("Name"+i);
            obj.put(newObj.toString(),newObj);
        }
        return obj;
    }


}

class Cat{

    private final String name;

    Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package com.module_4.collections;

import java.util.*;

public class HashSetTasks {

    String[] plantName = new String[]{"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
    String[] plantType = new String[]{"ягода", "трава", "ягода", "фрукт",  "овощ", "куст", "корень", "ягода", "цветок", "клубень" };

    public Set<String> plants(){

        Set<String> plantsHashSet= new HashSet<>();
        Collections.addAll(plantsHashSet,plantName);

        return plantsHashSet;
    }

    public Map<String,String> plantsAndType(){

        Map<String,String> plantsHashMap = new HashMap<>();
        for(int i=0; i<plantType.length; i++){
            plantsHashMap.put(plantName[i],plantType[i]);
        }

        return plantsHashMap;
    }

    public Map<String, Cat> catsCreation(){

        Map<String,Cat> cats = new HashMap<>();
        for (int i=0; i<10; i++){
            Cat newCat = new Cat("Name"+i);
            cats.put(newCat.getName(),newCat);
        }
        return cats;
    }

    public Map<String,Object> hashMapForPrint(){

        Map<String,Object> obj = new HashMap<>();
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

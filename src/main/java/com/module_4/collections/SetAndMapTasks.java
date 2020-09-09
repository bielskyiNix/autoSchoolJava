package com.module_4.collections;

import java.util.*;

public class SetAndMapTasks {

    static String[] firstName = new String[]{"Иван", "Игорь", "Кирилл", "Дарья", "Анна", "Марина", "Ольга", "Александр", "Борис", "Кирилл"};
    static String[] lastName = new String[]{"Белоус", "Пробейголова", "Белка", "Поттер",  "Гриффиндор", "Редл", "Утюг", "Ястребь", "Кучеров", "Калач" };

    public static Set<String> hashSetAdd20Strings(){
        Set<String> hashSet20 = new HashSet<>();
        hashSet20.addAll(Arrays.asList("Лондон","Лимон","Лук","Лакомство","Луковица",
                "Ладан","Лист","Логика","Ликорис","Лак",
                "Луна","Лимфоузел","Лазер","Лакей","Люк",
                "Лепесток","Лебедь","Ларёк","Лампа","Луг"));
        return hashSet20;
    }

    public static Set<Integer> hashSetAdd10Integers(boolean remove10){
        Set<Integer> hashSet10 = new HashSet<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            hashSet10.add(random.nextInt(20 + 1));
        }
        if (remove10) hashSet10.removeIf(i->i > 10);
        return hashSet10;
    }

    public static HashMap<String, String> firstNameLastName() {

        HashMap<String, String> firstNameLastNameMap= new HashMap<>();


        for(int i=0; i<lastName.length; i++){
            firstNameLastNameMap.put(lastName[i],firstName[i]);
        }

        return firstNameLastNameMap;
    }






}

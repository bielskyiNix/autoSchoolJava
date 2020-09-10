package com.module_4.collections;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class SetAndMapTasks {

    public static Set<String> hashSetAdd20Strings() {

        Set<String> hashSet20 = new HashSet<>();

        hashSet20.addAll(Arrays.asList("Лондон", "Лимон", "Лук", "Лакомство", "Луковица",
                "Ладан", "Лист", "Логика", "Ликорис", "Лак",
                "Луна", "Лимфоузел", "Лазер", "Лакей", "Люк",
                "Лепесток", "Лебедь", "Ларёк", "Лампа", "Луг"));

        return hashSet20;
    }

    public static Set<Integer> hashSetAdd10Integers(int setSize, boolean removeGreaterThan10) {

        Set<Integer> hashSet10 = new HashSet<>();
        Random random = new Random();

        while (hashSet10.size() < setSize) {

            hashSet10.add(random.nextInt(30 + 1));

        }

        if (removeGreaterThan10) hashSet10.removeIf(i -> i > 10);

        return hashSet10;
    }

    public static Map<String, String> firstNameLastNameCreation(String[] lastName, String[] firstName) {

        Map<String, String> firstNameLastNameMap = new HashMap<>();

        for (int i = 0; i < lastName.length; i++) {

            firstNameLastNameMap.put(lastName[i], firstName[i]);

        }

        return firstNameLastNameMap;
    }

    public static int checkContainName(List<String> usersName, Map<String, String> namesMap) {

        int count = 0;
        Iterator<Map.Entry<String, String>> entryIterator = namesMap.entrySet().iterator();

        if (namesMap.containsKey(usersName.get(0))) {

            while (entryIterator.hasNext()) {

                Map.Entry<String, String> entry = entryIterator.next();

                if (entry.getKey().equals(usersName.get(0))) {
                    count++;
                    break;

                }
            }
        }
        else if (namesMap.containsValue(usersName.get(0))) {

            while (entryIterator.hasNext()) {

                Map.Entry<String, String> entry = entryIterator.next();

                if (entry.getValue().equals(usersName.get(0))) {

                    count++;

                }
            }
        }

        return count;
    }

    public static Map<String, String> deleteWithSameFirstName(Map<String, String> usersMap) {

        ArrayList<String> usersFirstName = new ArrayList<>(usersMap.values());

        for (String nameOfCurrentIteration : usersFirstName) {

            int count = 0;

            for (int i = 0; i < usersFirstName.size(); i++) {

                if (nameOfCurrentIteration.equals(usersFirstName.get(i))) {

                    count++;

                }
                if (count > 1) {

                    removeItemByValue(usersMap, nameOfCurrentIteration);
                    break;

                }
            }
        }

        return usersMap;

    }


    public static Map<String, String> removeItemByValue(Map<String, String> usersMap, String value) {

        Map<String, String> copyOfUsersMap = new HashMap<>(usersMap); // для обхода ConcurrentModificationException

        for (Map.Entry<String, String> entry : usersMap.entrySet()) {

            if (entry.getValue().equals(value)) {

                usersMap.remove(entry.getKey());

            }
        }

        return usersMap;
    }

    public static Map<String, LocalDate> deleteBornInSummer(String[] lastName) {

        Map<String, LocalDate> lastNameDateOfBirthMap = new HashMap<>();
        Random random = new Random();
        int min = 7300;

        for (int i = 0; i < lastName.length; i++) {

            lastNameDateOfBirthMap.put(lastName[i], LocalDate.now().minusDays(min + random.nextInt(30000 + 1)));

        }

        System.out.println("Список имен без изменений");
        ReaderWriter.printMap(lastNameDateOfBirthMap, "key-value");

        Iterator<Map.Entry<String, LocalDate>> entryIterator = lastNameDateOfBirthMap.entrySet().iterator();

        while (entryIterator.hasNext()) {

            Map.Entry<String, LocalDate> entry = entryIterator.next();

            if (entry.getValue().getMonth() == Month.AUGUST || entry.getValue().getMonth() == Month.JUNE || entry.getValue().getMonth() == Month.JULY) {
                entryIterator.remove();

            }
        }

        System.out.println();
        System.out.println("Список имен без рожденных летом");

        return lastNameDateOfBirthMap;
    }
}


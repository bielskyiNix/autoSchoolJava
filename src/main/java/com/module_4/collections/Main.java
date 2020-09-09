package com.module_4.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

   public static void main(String[] args) throws IOException {

      //Задачи на HashSet
      HashSetTasks obj = new HashSetTasks();
      System.out.println("Tasks 1-6");
      ReaderWriter.printerList(obj.plants()); // Task1: "HashSet из растений"
      ReaderWriter.printHashMap(obj.plantsAndType(),"key-value"); // Task2: "HashMap из 10 пар"
      ReaderWriter.printHashMap(obj.catsCreation(),"key-value");  // Task3: "Коллекция HashMap из котов"
      ReaderWriter.printHashMap(obj.plantsAndType(), "key"); // Task 4: "Вывести на экран список ключей"
      ReaderWriter.printHashMap(obj.plantsAndType(), "value"); // Task 5: "5. Вывести на экран список значений"
      ReaderWriter.printHashMap(obj.hashMapForPrint(),"key-value"); // Task 6: Коллекция HashMap из Object

      System.out.println("Tasks 7-11");
      ReaderWriter.printerList(ReaderWriter.readUsersStrings(5), true); // Task 7: " 5 различных строчек в списке"
      ReaderWriter.printerList(ArrayListTasks.findLargestOrSmallestString(ReaderWriter.readUsersStrings(5), "largest"), false); // Task 8: "Самая длинная строка"
      ReaderWriter.printerList(ArrayListTasks.findLargestOrSmallestString(ReaderWriter.readUsersStrings(5), "smallest"), false); // Task 9: "Самая короткая строка"

      // Task10: "10 строчек в начало списка"
      ArrayList<String> createdList= new ArrayList<>();
      Collections.addAll(createdList, new String[]{"list1element", "list2element","list3element","list4element", "list5element"});
      ReaderWriter.printerList(ArrayListTasks.addListToBeginning(createdList,ReaderWriter.readUsersStrings(5)), false);

      ReaderWriter.printerList(ArrayListTasks.addRemoveLastElement(ReaderWriter.readUsersStrings(5)), false); //Task 11: "Удали последнюю строку и вставь её в начало"


      // Task11: "Создать множество строк (Set<String>), занести в него 20 слов на букву «Л»."
      ReaderWriter.printerList(SetAndMapTasks.hashSetAdd20Strings());
      System.out.println(SetAndMapTasks.hashSetAdd20Strings().size());

      // Task12: "Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.Удалить из множества все числа больше 10."

      ReaderWriter.printerList(SetAndMapTasks.hashSetAdd10Integers(true));

   }
}

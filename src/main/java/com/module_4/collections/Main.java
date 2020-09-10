package com.module_4.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class Main {



   public static void main(String[] args) throws IOException {

      //Задачи на HashSet
      //HashSetTasks obj = new HashSetTasks();
      //System.out.println("Tasks 1-6");
      //ReaderWriter.printerList(obj.plants()); // Task1: "HashSet из растений"
      //ReaderWriter.printMap(obj.plantsAndType(),"key-value"); // Task2: "HashMap из 10 пар"
      //ReaderWriter.printMap(obj.catsCreation(),"key-value");  // Task3: "Коллекция HashMap из котов"
      //ReaderWriter.printMap(obj.plantsAndType(), "key"); // Task 4: "Вывести на экран список ключей"
      //ReaderWriter.printMap(obj.plantsAndType(), "value"); // Task 5: "5. Вывести на экран список значений"
      //ReaderWriter.printMap(obj.hashMapForPrint(),"key-value"); // Task 6: Коллекция HashMap из Object

      //Задачи на ArrayList
      //System.out.println("Tasks 7-11");
      //ReaderWriter.printerList(ReaderWriter.readUsersStrings(5), true); // Task 7: " 5 различных строчек в списке"
      //ReaderWriter.printerList(ArrayListTasks.findLargestOrSmallestString(ReaderWriter.readUsersStrings(5), "largest"), false); // Task 8: "Самая длинная строка"
      //ReaderWriter.printerList(ArrayListTasks.findLargestOrSmallestString(ReaderWriter.readUsersStrings(5), "smallest"), false); // Task 9: "Самая короткая строка"

      // Task10: "10 строчек в начало списка"
      //ArrayList<String> createdList= new ArrayList<>();
      //Collections.addAll(createdList, new String[]{"list1element", "list2element","list3element","list4element", "list5element"});
      //ReaderWriter.printerList(ArrayListTasks.addListToBeginning(createdList,ReaderWriter.readUsersStrings(5)), false);

      //ReaderWriter.printerList(ArrayListTasks.addRemoveLastElement(ReaderWriter.readUsersStrings(5)), false); //Task 11: "Удали последнюю строку и вставь её в начало"


      // Task12: "Создать множество строк (Set<String>), занести в него 20 слов на букву «Л»."
      //ReaderWriter.printerList(SetAndMapTasks.hashSetAdd20Strings());
      //System.out.println(SetAndMapTasks.hashSetAdd20Strings().size());

      // Task13: "Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.Удалить из множества все числа больше 10."
      //ReaderWriter.printerList(SetAndMapTasks.hashSetAdd10Integers(20,true));

      // С фамилиями кому-то не повезло :D (для задач 14,15,16,17)
      String[] firstNameValues = new String[]{"Иван", "Игорь", "Кирилл", "Дарья", "Анна", "Марина", "Ольга", "Александр", "Борис", "Сергей"};
      String[] lastNameValues = new String[]{"Белоус", "Пробейголова", "Белка", "Поттер",  "Гриффиндор", "Редл", "Утюг", "Ястребь", "Кучеров", "Калач" };
      String[] firstNameWithDuplicates = new String[]{"Марина", "Игорь", "Кирилл", "Игорь", "Анна", "Марина", "Ольга", "Марина", "Борис", "Кирилл"};
      String[] lastNameWithDuplicates = new String[]{"Белоус", "Пробейголова", "Белка", "Поттер",  "Гриффиндор", "Пробейголова", "Утюг", "Ястребь", "Кучеров", "Утюг"};

      // Task 14: " Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя». Проверить сколько людей имеют совпадающие с заданным имя или фамилию."
      //System.out.println("Number of people with a same first name or last name: " + (SetAndMapTasks.checkContainName(ReaderWriter.readUsersStrings(1),SetAndMapTasks.firstNameLastNameCreation(lastNameValues,firstNameWithDuplicates))));

      // Task 15: "Создать словарь (Map<String, LocalDate>) и занести в него десять записей по принципу: «фамилия» - «дата рождения». Удалить из словаря всех людей, родившихся летом."
      //ReaderWriter.printMap(SetAndMapTasks.deleteBornInSummer(lastNameValues), "key-value");

      // Task 16: "Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя». Удалить людей, имеющих одинаковые имена."
      ReaderWriter.printMap(SetAndMapTasks.deleteWithSameFirstName(SetAndMapTasks.firstNameLastNameCreation(lastNameValues,firstNameWithDuplicates)),"key-value");

      // Task 17: "Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя» c одинакоыми фамилиями или именами.
      //ReaderWriter.printMap(SetAndMapTasks.firstNameLastNameCreation(lastNameWithDuplicates,firstNameWithDuplicates),"key-value");


   }
}

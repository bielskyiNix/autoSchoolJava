package com.module_1.arrays;

public class PracticalTasks {

    public static void Max(int[] array){

        int max = array[0];

        for (int i=0; i< array.length; i++){

            if (max < array[i]){

                max = array[i];

            }

        }
        System.out.println("Max=" + max);
    }

    public static void invertedArray(String[] list){

        System.out.println("Inverted list of strings:");

        for (int i = list.length-1; i >= 0; i--) {

            System.out.println(list[i]);

        }
    }

    public static int[] returnNumbersList(String[] list) {

        int[] numbers = new int[10];

        for(int i = 0; i < list.length; i++){

            numbers[i] = list[i].length();

        }
        return numbers;
    }

    public static int[] reversedArray(int[] list){

        int k = list.length - 1;
        int temp;

        for(int i = 0; i < list.length/2; i++){

            temp = list[i];
            list[i] = list[k - i];
            list[k - i] = temp;

        }
        return list;
    }

    public static int[] twoArrays(int[] list){

        int[] list1 = new int[10];
        int[] list2 = new int[10];

        System.arraycopy(list,0,list1,0,10);
        System.arraycopy(list,10,list2,0,10);

        return list2;
    }
}

package com.edu.lesson4;

public class ArrayEx7 {

    public static void main(String[] args) {
        String[] array = new String[]{"Barsik", "Murzik"};

        Object[] array2 = array;

        String[] array3 = (String[]) array2;

//        System.out.println(array[2]);
        Object[] objects = new String[3];
        objects[0] = new Integer(2);

        System.out.println();
    }
}

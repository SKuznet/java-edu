package com.edu.hw;

import java.util.Arrays;

/* Дан массив. Все его элементы:
 а) уменьшить на 20;
 б) умножить на последний элемент;
 в) увеличить на число В.  */

public class Ex11_18 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        // а) уменьшить на 20;
        int[] arrayA = new int[array.length];
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = array[i] - 20;
        }
        System.out.println(Arrays.toString(arrayA));

        //б) умножить на последний элемент;
        int[] arrayB = new int[array.length];
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = array[i] * array[array.length - 1];
        }
        System.out.println(Arrays.toString(arrayB));

        //в) увеличить на число В.
        int[] arrayC = new int[array.length];
        int b = 6;
        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = array[i] + b;
        }
        System.out.println(Arrays.toString(arrayC));
    }
}

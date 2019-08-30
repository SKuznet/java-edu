package com.edu.lesson4;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());

        // recommend
        int[] array = new int[2];
        // non-r
        int[] array2[] = new int[2][2];
        int array3[][] = new int[2][2];

        String[][] array4 = new String[4][2];
        System.out.println(Arrays.deepToString(array4));

        System.out.println(array4[2][0]);


    }
}

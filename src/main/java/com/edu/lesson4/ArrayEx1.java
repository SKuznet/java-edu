package com.edu.lesson4;

import java.util.Arrays;

public class ArrayEx1 {
    String s = null;
    String s1;

    int i = 0;
    int j;

    public static void main(String[] args) {
        String s = null;

        ArrayEx1 ex1 = new ArrayEx1();
        System.out.println(ex1.s1);

        int[][][] array = new int[4][2][2];
        System.out.println(Arrays.deepToString(array));

        String[] array2 = new String[2];
        System.out.println(Arrays.toString(array2));

        array2[0] = "Barsik";

        System.out.println(Arrays.toString(array2));
    }
}

package com.edu.lesson4;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[][] array = new int[4][2];

        System.out.println(array.length);
        System.out.println(array[0].length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = j + 1;
            }
        }

        System.out.println(Arrays.deepToString(array));
    }
}

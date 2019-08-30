package com.edu.lesson4;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[][][] array = new int[10][10][10];

        // max [][][][]
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                    System.out.println(k);
                }
            }
        }
    }
}

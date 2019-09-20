package com.edu.hw;

import java.util.Arrays;

public class Ex11_7 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int number = 20;
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
            number -= 1;
        }
        System.out.println(Arrays.toString(array));
    }
}

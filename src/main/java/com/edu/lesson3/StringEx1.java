package com.edu.lesson3;

import java.util.Arrays;

public class StringEx1 {
    public static void main(String[] args) {
        String cat = "Barsik";

        System.out.println(cat.charAt(1));
        System.out.println(cat.length());

        char[] chars = cat.toCharArray();

        for (int i = 0; i < cat.length(); i++) {
            System.out.println(chars[i]);
        }

        System.out.println(cat.subSequence(2, 5));
        System.out.println(cat.toString());
        int val = 5;
        System.out.println(val);

        System.out.println(cat.codePointAt(3));

        char c = 115;
        System.out.println(c);

        System.out.println(Arrays.toString(cat.getBytes()));
    }

    private String getValue(int a) {
        a = a + 1;
        return String.valueOf(a);
    }
}

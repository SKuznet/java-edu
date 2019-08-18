package com.edu.lesson3;

public class StringEx2 {
    public static void main(String[] args) {
        String value = "Barsik";
        String value2 = "baRsik";
        String value3 = "BarsiK";

        System.out.println(value.equalsIgnoreCase(value2));
        System.out.println(value.equals(value2));
        System.out.println(value.compareTo(value3));

        String barsik = "Barsik";
        StringBuilder builder = new StringBuilder();
        builder.append(barsik);

        System.out.println(value.contentEquals(builder));
        System.out.println(value.equals(builder.toString()));

        System.out.println(value.toUpperCase());
        System.out.println(value);
        System.out.println(value.toLowerCase());

        value = value.toUpperCase();
        System.out.println(value);

        char[] array = value.toCharArray();

        for (int i = value.length() - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println();
        System.out.println(builder.reverse());

//
//        for (char a : value.toCharArray()) {
//            System.out.println(a);
//        }
//        StringBuffer
    }
}

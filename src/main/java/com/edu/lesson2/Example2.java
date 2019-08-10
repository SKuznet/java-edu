package com.edu.lesson2;

public class Example2 {
    public static void main(String[] args) {
        //psvm
        Short a = 127;
        Short b = 127;

        System.out.println(a == b);

        Short a1 = 128;
        Short a2 = 128;

        // byte -128 ..0 127

        System.out.println(a1 == a2);
    }
}

package com.edu.lesson2;

public class Ex2 {
    static int a;

    static {
        a = 15;
    }

    {
        int a = 10;
        System.out.println(10);
    }

    public static void main(String[] args) {
        System.out.println(a);
    }


}

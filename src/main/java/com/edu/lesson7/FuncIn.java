package com.edu.lesson7;

public interface FuncIn {
    int count = 10;

    static void getInfo(){
        System.out.println("I am static in interface" + count);
    }

    default void getInfo2(){
        System.out.println("I am from interface");
    }
}

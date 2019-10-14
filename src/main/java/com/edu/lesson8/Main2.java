package com.edu.lesson8;

public class Main2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            ThreadEx threadEx = new ThreadEx();
            threadEx.start();
        }
    }
}

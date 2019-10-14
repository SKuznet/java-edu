package com.edu.lesson8;

public class RunnableEx implements Runnable {
    @Override
    public void run() {
        System.out.println("I am runnable from " + Thread.currentThread().getName());
    }
}

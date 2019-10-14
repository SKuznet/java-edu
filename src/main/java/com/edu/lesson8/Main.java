package com.edu.lesson8;

public class Main {
    public static void main(String[] args) {
        System.out.println("I am from thread " + Thread.currentThread().getName());
        ThreadEx threadEx = new ThreadEx();
        threadEx.start();
        RunnableEx runnableEx = new RunnableEx();
        Thread thread = new Thread(runnableEx);
        thread.start();
        for (int i = 0; i < 10 ; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}

package com.edu.lesson8;

public class ThreadEx extends Thread {
    @Override
    public void run() {
        System.out.println("I am from another thread " + Thread.currentThread().getName());

        for (int i = 0; i < 10 ; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + Thread.currentThread().getName());
        }
    }
}

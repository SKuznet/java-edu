package com.edu.lesson8;

public class Ex {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 20; i++) {
                        System.err.println(Thread.currentThread().getName() + " " + i);
                        Thread.yield();
                    }
                }
            });
            thread.start();
        }

    }
}

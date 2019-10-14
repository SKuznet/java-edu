package com.edu.lesson8;

import java.io.IOException;

public class VolatileEx {
    private static volatile boolean flag = true;

    public static void main(String[] args) {
        new ThreadFlaggReader().start();
        new ThreadFlaggSetter().start();
    }

    public static class ThreadFlaggReader extends Thread {
        @Override
        public void run() {
            System.err.println("waiting...");
            while (flag) {
            }
            System.err.println("Gogogo...");
        }
    }

    public static class ThreadFlaggSetter extends Thread {
        @Override
        public void run() {
            try {
                int k = System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            flag = false;
            System.err.println("Flag now is down");
        }
    }

}

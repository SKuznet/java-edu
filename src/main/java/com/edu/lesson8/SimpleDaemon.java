package com.edu.lesson8;

public class SimpleDaemon implements Runnable{
    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(100);
                System.out.println(Thread.currentThread() + " " + this + " " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            System.err.println("sleep interrupt");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemon());
            daemon.setDaemon(true);
            daemon.start();
        }

        System.out.println("all daemons is ran");

        try {
            Thread.sleep(264);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

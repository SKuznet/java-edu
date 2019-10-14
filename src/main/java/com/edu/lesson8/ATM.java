package com.edu.lesson8;

public class ATM {
    private static int money = 100;

    // toilet
    static synchronized void getMoney(int amount) {
        if (amount <= money) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money -= amount;
            System.err.println("All Ok! New amount: " + money);
        } else {
            System.err.println("Not enough money");
        }
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Mike");
                getMoney(50);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Jack");
                getMoney(50);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Ivan");
                getMoney(50);
            }
        }).start();
        Thread thread = new Thread();
        thread.start();
    }
}

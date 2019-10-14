package com.edu.lesson7;

public class Ex3 {
    public static void main(String[] args) {
        Cat cat = new Barsik();
        Cat cat1 = new Cat() {
            @Override
            public void getCount() {
                System.out.println(11);
            }
        };

        cat1.getCount();
    }
}

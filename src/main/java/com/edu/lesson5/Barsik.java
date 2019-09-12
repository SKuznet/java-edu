package com.edu.lesson5;

public class Barsik extends GreyCat implements Cat {

    @Override
    public void getVoice() {

    }

    @Override
    public void getEat() {
        System.out.println(1);
    }

    public static void main(String[] args) {
        GreyCat cat = new Barsik();
        cat.getEat();
    }
}

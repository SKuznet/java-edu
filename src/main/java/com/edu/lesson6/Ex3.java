package com.edu.lesson6;

public class Ex3 {
    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();
        System.out.println(ex3.getCount2());
    }

    private int getCount() {
        int i = 0;

        try {
            // with System exit finally not work!
//            System.exit(1);
        } finally {
            return i;
        }
    }

    // NEVER USE IT!!!
    private int getCount2(){
        int i = 0;
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            i = 5;
            return i;
        } finally {
            i = 10;

            System.out.println("I am from finally " + i);
            return i;
        }
    }


}

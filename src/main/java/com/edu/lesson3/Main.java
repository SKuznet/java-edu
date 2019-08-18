package com.edu.lesson3;

public class Main {
//    String info;
    String info = null;
//    int anInt;
    int anInt = 0;

    public static void main(String[] args) {
        String info1 = null;
        String info2 = "";

        System.out.println(info1);
        System.out.println(info2);

        System.out.println(info2.isEmpty());
        System.out.println(info1.isEmpty());

        // not equal to val2
        String value = new String("Barsik!").intern();
        String value2 = new String("Barsik!").intern();
        String value3 = "Barsik!";

        // pool literal
        // never compare the strings with ==
        System.out.println(value == value2);

        // inMutable
        String value4 = "Jack";
        value4 = value4 + " Vorobey";

        String value5 = "Jack " + " Vorobey " + " the " + "captain";
    }
}

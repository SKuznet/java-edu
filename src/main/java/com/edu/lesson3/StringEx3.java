package com.edu.lesson3;

public class StringEx3 {
    public static void main(String[] args) {
        String barsik = "Barsik";
        String name = "Jack the Captain";

        System.out.println(barsik.indexOf('a'));
        System.out.println(name.indexOf('a', 3));
        System.out.println(name.lastIndexOf('a'));

        // recommend
        System.out.println(name.replace('a', 'o'));
        System.out.println(name.replaceAll("a", "o"));

        System.out.println(name.contains("the1"));
        System.out.println(barsik.endsWith("sik"));

        String murzik = "  mur zik ";
        System.out.println(murzik.trim());

        System.out.println(name.substring(5));
        byte a = 12;
        String.valueOf(a);
    }
}

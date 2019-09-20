package com.edu.hw;

import java.util.Scanner;

/*Дано слово. Проверить, является ли оно "перевертышем" (перевертышем называется слово,
        читаемое одинаково как с начала, так и с конца).*/
public class Ex9_78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово на проверку");
        String example = scanner.nextLine();
        String word = example.toLowerCase();
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        boolean isPalindrome = word.equals(reverse);
        if (isPalindrome) {
            System.out.println("Слово - палиндром!");
        } else {
            System.out.println("Слово не палиндром!");
        }

    }
}

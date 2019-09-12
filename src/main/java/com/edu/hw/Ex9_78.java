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
        System.out.println(word);
    }
}

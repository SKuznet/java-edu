package com.edu.hw;

import java.util.Scanner;
//Дано предложение.Составить программу
// которая выводит все вхождения в предложение двух заданных символов.

public class Ex9_55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String str = scanner.nextLine();
        System.out.println("Введите через пробел два заданных символв");

        String letters = scanner.nextLine();
        String[] words;
        String[] let;
        String divider = " ";
        words = str.split(divider);
        let = str.split(divider);


    }
}



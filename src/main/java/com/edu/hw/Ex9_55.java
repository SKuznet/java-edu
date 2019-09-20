package com.edu.hw;

import java.util.Arrays;
import java.util.Scanner;
//Дано предложение.Составить программу
// которая выводит все вхождения в предложение двух заданных символов.

public class Ex9_55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String str = scanner.nextLine();
        System.out.println("Введите два заданных символа");
        String letters = scanner.nextLine();
        char[] words;
        char[] let;
        /*
        String divider = " ";
        words = str.split(divider);
        let = str.split(divider);*/
        words = str.toCharArray();
        let = letters.toCharArray();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < let.length ; j++) {
                if(words[i] == let[j]) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}



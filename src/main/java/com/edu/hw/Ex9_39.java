package com.edu.hw;

import java.sql.SQLOutput;
import java.util.Scanner;

/*Дано слово.Переставить первые три и последние три буквы,сохранив порядок их следования.
        Задачу решить двумя способами:
        1)без использования оператора цикла;
        2)с использованием оператора цикла.*/
public class Ex9_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scanner.nextLine();

        System.out.println(word.substring(3) + word.substring(0, 3));
        //second way
        char[] letters = word.toCharArray();

        for (int i = 3; i < letters.length; i++) {
            System.out.print(letters[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(letters[i]);
        }
    }
}

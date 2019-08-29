package com.edu.hw;

import java.util.Scanner;

// Дано слово, состоящее из четного числа букв.
// Вывести на экран его первую половину, не используя оператор цикла.

public class Ex9_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word with an even number of letters");
        String word = scanner.nextLine();
        int endIndex = (word.length() - 1) / 2;
        //System.out.println(endIndex);
        System.out.println("That's first half of word - "+word.subSequence(0, endIndex + 1));


    }
}

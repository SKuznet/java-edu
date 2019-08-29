package com.edu.hw;

import java.util.Scanner;

//Составить программу, которая запрашивает отдельно имя и отдельно фамилию,
// а затем выводит их как одну символьную строку.
public class Ex9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your surname");
        String surname = scanner.nextLine();
        System.out.println("Your full name is - " + name + " " + surname);
    }
}

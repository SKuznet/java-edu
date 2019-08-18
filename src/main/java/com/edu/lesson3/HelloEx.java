package com.edu.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// б) запрашивает имя человека и повторяет его на экране с приветствием.
public class HelloEx {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your name");
        String value = reader.readLine();

        System.out.println("Hello " + value);
    }
}

package com.edu.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {

    public static void main(String[] args) {

    }

    private String getInfo() throws IOException {
        // try catch
        try {

        } catch (Exception e) {

        }

        // try finally
        try {

        } finally {

        }

        // try catch finally
        try {

        } catch (Exception e) {

        } finally {

        }

        // try with resources since java 7
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

        }

        return "1";
    }
}

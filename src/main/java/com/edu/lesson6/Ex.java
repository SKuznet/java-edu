package com.edu.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex {
    // throw, catch, finally, try, throws

    public static void main(String[] args) throws IOException {
        Ex ex = new Ex();
        ex.getInfo();
    }

    private String getInfo() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}

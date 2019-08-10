package com.edu.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 0
    static int count;
    // null
    static Integer countI;

    public static void main(String[] args) {
        String line = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        int result = Integer.parseInt(line);

//        System.out.println(result);
        System.out.println(count);
        System.out.println(countI);
        String info = null;
        System.out.println(info);
        float a = 0.3F;
        int b = (int) a;
        System.out.println(b);

        long num1 = 2_200_000_000L;
        int num2 = (int) num1;
        System.out.println(num2);
    }
}

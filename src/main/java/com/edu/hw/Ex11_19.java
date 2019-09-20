package com.edu.hw;

import java.util.Arrays;
import java.util.Scanner;

/*Определить:
а) сумму всех элементов массива;
б) произведение всех элементов массива;
в) сумму квадратов всех элементов массива;
г) сумму шести первых элементов массива;
д) сумму элементов массива с k1-го по k2-й (значения k1 и k2 вводятся  с клавиатуры; k2 > k1);
е) среднее арифметическое всех элементов массива;
ж) среднее арифметическое элементов массива с s1-го по s2-й (значения s1 и s2 вводятся с клавиатуры; s2 > s1). */
public class Ex11_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {3, 5, 6, 2, 8, 9, 10};

        //а) сумму всех элементов массива;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);

        //б) произведение всех элементов массива;
        int factorial = 1;
        for (int i = 0; i < array.length; i++) {
            factorial *= array[i];
        }
        System.out.println(factorial);

        //в) сумму квадратов всех элементов массива;
        int sumOfQuads = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfQuads += array[i] * array[i];
        }
        System.out.println(sumOfQuads);

        //г) сумму шести первых элементов массива;
        int sumOfSix = 0;
        for (int i = 0; i < 6; i++) {
            sumOfSix += array[i];
        }
        System.out.println(sumOfSix);

        //д) сумму элементов массива с
        // k1-го по k2-й (значения k1 и k2 вводятся  с клавиатуры; k2 > k1);
        int sumFromK1ToK2 = 0;
        System.out.println("Введите к1");
        int k1 = scanner.nextInt();
        System.out.println("Введите к2");
        int k2 = scanner.nextInt();
        for (int i = k1; i <= k2; i++) {
            sumFromK1ToK2 += array[i];
        }
        System.out.println(sumFromK1ToK2);

        //е) среднее арифметическое всех элементов массива;
        double approximate = (double) sum / array.length;
        System.out.println(approximate);

        //среднее арифметическое элементов массива
        // с s1-го по s2-й (значения s1 и s2 вводятся с клавиатуры; s2 > s1).
        int appSum = 0;
        double approxFromS1ToS2 = 0.0;
        System.out.println("Введите s1");
        int s1 = scanner.nextInt();
        System.out.println("Введите s2");
        int s2 = scanner.nextInt();
        for (int i = s1; i <= s2 ; i++) {
            appSum += array[i];
        }
        approxFromS1ToS2 = (double)appSum / (s2 - s1 + 1);
        System.out.println(approxFromS1ToS2);
    }
}

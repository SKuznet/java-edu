package com.edu.lesson6;

import java.util.Optional;

public class Ex4 {
    public static void main(String[] args) {

        String val = null;

        // VERY BAD
//        try {
//            System.out.println(val.toUpperCase());
//        } catch (NullPointerException e) {
//            System.out.println(" val is null");
//        }
//
//        if (val != null) {
//            System.out.println(val.toUpperCase());
//        } else {
//            throw new IllegalArgumentException("val shouldn't be null");
//        }

        Optional<String> val2 = Optional.ofNullable(null);

        System.out.println(val2.orElse("Barsik"));

    }
}

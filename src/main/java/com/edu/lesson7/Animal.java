package com.edu.lesson7;

@FunctionalInterface
public interface Animal extends Flyable {

    interface Eatable {
        void care();
    }

    class Citty implements Eatable {
        public static void main(String[] args) {

        }

        @Override
        public void care() {

        }
    }
}

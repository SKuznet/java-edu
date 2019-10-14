package com.edu.lesson7;

public class Sender {
    private String name;

    public Sender(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sender{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

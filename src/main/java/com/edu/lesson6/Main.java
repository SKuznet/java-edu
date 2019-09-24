package com.edu.lesson6;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getInfo("Murzik"));
        throw new MyException("", 1);
    }

    private String getInfo(String val){
        if(val.equals("Barsik")) {
            return val;
        }

        throw new IllegalArgumentException("Val should be barsik");
    }
}

package com.edu.lesson7;

public class Main implements InterfaceEx, InterfaceEx2, FuncIn, FuncIn2 {

    public static void main(String[] args) {
        System.out.println(FuncIn.count);
        FuncIn.getInfo();
        Main main = new Main();
        main.getInfo2();

        FuncIn funcIn = new Main();
    }

    @Override
    public void getInfo3() {

    }

    @Override
    public void getInfo2() {

    }

}

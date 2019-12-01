package com.edu.lesson10;


public class Calc implements CalcService{
    private CalcService calcService;

    public Calc(CalcService calcService) {
        this.calcService = calcService;
    }


    public double sum(double val1, double val2) {
        return calcService.sum(val1, val2);
    }
}

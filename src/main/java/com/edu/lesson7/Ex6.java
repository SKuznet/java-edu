package com.edu.lesson7;

public class Ex6<T extends Number> {
    private T mark;

    public Ex6(T mark) {
        this.mark = mark;
    }

    public T getMark() {
        return mark;
    }

    public void setMark(T mark) {
        this.mark = mark;
    }

    public int roundMark() {
        return Math.round(mark.floatValue());
    }

    public boolean sameAny(Ex6<?> ob) {
        return roundMark() == ob.roundMark();
    }
}

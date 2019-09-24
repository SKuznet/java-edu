package com.edu.lesson6;

public class MyException extends RuntimeException {
    private int code;

    public MyException(String message, int code) {
        super(message);
        this.code = code;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "code=" + code +
                '}';
    }
}

package com.edu.lesson7;

public class Message<T1, T2> {
    private T1 id;
    private T2 name;

    public Message(T1 id, T2 name) {
        this.id = id;
        this.name = name;
    }

    public void getInfo(){
        System.out.println(id + " " + name);
    }
}

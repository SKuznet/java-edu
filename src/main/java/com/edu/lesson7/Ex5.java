package com.edu.lesson7;

import java.util.Optional;

public class Ex5 {

    public static void main(String[] args) {
        Sender sender = new Sender("Jack");
        Id id = new Id(2);

        Message<Id, Sender> message = new Message<>(id, sender);
        Message<Integer, String> message1 = new Message<>(1, "Karl");
        message1.getInfo();
        message.getInfo();

        OptionalExt<Double> optionalExt = new OptionalExt<>();
        optionalExt.getValue(2.0);
    }
}

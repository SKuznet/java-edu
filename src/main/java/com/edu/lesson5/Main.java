package com.edu.lesson5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
//    Collection
//    List, Set, Queue
//

// NOT COLLECTION!
//    Map

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>(10000);
        List<Integer> list3 = new ArrayList<>();
        list.get(1);
        list3.add(2);
        list.add("Barsik");

        List<String> list4 = new LinkedList<>();

        // O
        // size = 10
        // O1
        // size = size + size*0.5
        //
        // 15
        // 23
    }
}

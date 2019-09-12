package com.edu.lesson5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Barsik");
        list.add("Barsik");
        list.add("Murzik");

        System.out.println(list);

        List<String> list1 = new LinkedList<>();
        list1.add("Snegok");

        list1.addAll(list);
        System.out.println(list1);

        // never use it
//        for (String s : list) {
//            if (s.equals("Barsik")) {
//                list.remove("Barsik");
//            }
//        }

        Iterator iterator = list.iterator();

//        while (iterator.hasNext()) {
//            if(iterator.next().equals("Barsik")) {
//                iterator.remove();
//            }
//        }

        while (iterator.hasNext()) {
            if(iterator.next().equals("Barsik")) {
                iterator.remove();
            }
        }

//        list.removeIf(O -> O.equals("Barsik"));

        System.out.println(list);
    }
}

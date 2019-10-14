package com.edu.lesson7;

public class Ex2 {
    public static void main(String[] args) {
        // before java 8
        FunctionalInterfaceEx interfaceEx = new FunctionalInterfaceEx() {
            @Override
            public String getInfo(String name) {
                return "Hello " + name;
            }
        };

        // since java 8
        FunctionalInterfaceEx interfaceEx2 = name -> "Hello " + name;

        System.out.println(interfaceEx.getInfo("Barsik"));

        System.out.println(interfaceEx.getInfo("Murzik"));
        System.out.println(getName(O -> O.toUpperCase()));
        System.out.println(getName(name -> "Hello " + name));
    }

    private static String getName(FunctionalInterfaceEx ex) {
        return ex.getInfo("Barsik");
    }
}

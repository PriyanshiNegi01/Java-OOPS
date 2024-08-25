package com.priyanshi.OOP.staticExample;

public class Main {
    public static void main(String[] args) {
        Human priyanshi = new Human(21, "Priyanshi", 15000, false);
        Human stuti = new Human(29, "Stuti", 20000, true);

        // NOTE: Whenever declaring, accessing or modifying static variable, don't do it via the object name
        // it will work but convention is to use the class name
//        System.out.println(priyanshi.population);
//        System.out.println(stuti.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}

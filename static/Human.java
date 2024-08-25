package com.priyanshi.OOP.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    // properties that are not really related to the object but are common to
    // all the objects of that class are declared as static
    // In order to access the static variable, you should use the class name

    static void message() {
        System.out.println("Hello World");
//        System.out.println(this.age); // cant use 'this' over here
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

}

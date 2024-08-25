package com.priyanshi.OOP.inheritance;

public class Main {
    public static void main(String[] args) {
        // Creating a Box object with specific dimensions
        Box box1 = new Box(4, 2, 6); // Compile-time polymorphism
        // Creating a Box object by copying another Box object
        Box box2 = new Box(box1); // Compile-time polymorphism
        System.out.println(box1.h + " " + box1.l + " " + box1.w);

        // Uncommenting the following lines will create BoxWeight objects and demonstrate inheritance
//        BoxWeight box3 = new BoxWeight(); // Default constructor of BoxWeight
//        BoxWeight box4 = new BoxWeight(2, 3, 4, 8); // Constructor with dimensions and weight
//        System.out.println(box3.w + " " + box3.weight); // Accessing inherited properties and weight

        // NOTE: The type of the reference variable (and not the type of object) determines what members can be accessed
//        Box box5 = new BoxWeight(2, 3, 4, 8); // Box reference to a BoxWeight object
//        System.out.println(box5.w); // Allowed: 'w' is a member of Box
//        System.out.println(box5.weight); // Error: 'weight' is a member of BoxWeight, not Box

        // NOTE: A child reference variable cannot reference a parent object
        // The following code will cause a compile-time error because the parent class doesn't initialize
        // the variables of the child class.
//        BoxWeight box6 = new Box(2, 3, 4); // Error: Cannot assign parent object to child reference
//        System.out.println(box6);

        // Creating a BoxPrice object with specific side, weight, and cost
        BoxPrice box = new BoxPrice(5, 8, 200); // side, weight, cost
    }
}

package com.priyanshi.OOP.intro;

public class OOPMain {
    public static void main(String[] args) {
        // Array to store 5 roll numbers
        int[] numbers = new int[5];

        // Array to store 5 names
        String[] names = new String[5];

        // Arrays to store the data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // Class: A class is a named group of properties and functions
        // Array to store Student objects
        Student[] students = new Student[5];

        // Creating an instance of Student with a parameterized constructor
        Student priyanshi = new Student(15, "Priyanshi Negi", 90.5f);

        // Displaying the properties of the student
        System.out.println(priyanshi.rno);   // Output: 15
        System.out.println(priyanshi.name);  // Output: Priyanshi Negi
        System.out.println(priyanshi.marks); // Output: 90.5

        // Creating another Student object by copying the properties of an existing one
        Student random = new Student(priyanshi);
        System.out.println(random.name); // Output: Priyanshi Negi

        // Creating a Student object with the default constructor
        Student random2 = new Student();
        System.out.println(random2.name); // Output: default person

        // Demonstrating that two variables can refer to the same object
        Student one = new Student();
        Student two = one;

        // Changing the name using one reference affects the other
        one.name = "Something something";
        System.out.println(two.name); // Output: Something something
    }
}

// Create a class to represent each student with properties and functions
class Student {
    int rno;  // Property to store roll number
    String name; // Property to store student's name
    float marks = 90; // Default value for marks

    // Method to print a greeting message with the student's name
    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    // Method to change the student's name
    void changeName(String newName) {
        name = newName;
    }

    // The return type of constructor is the class itself
    // "this" keyword --> used to access the current object

    // No-argument constructor
    Student() {
        // Calls the parameterized constructor with default values
        this(16, "default person", 100.0f);
        // Calling a constructor from another constructor
        // internally, 'this' keyword is replaced by the constructor name instead of the reference variable name
        // it is something like: new Student(16, "default person", 100.0f);

        // OR
        // this.rno = 12;
        // this.name = "Priyanshi Negi";
        // this.marks = 94.5f;
    }

    // Copy constructor: Initializes a new Student object with the values of an existing Student object
    Student(Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    // Parameterized constructor: Initializes a new Student object with specific values
    Student(int roll, String name, float marks) {
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }
}

package com.priyanshi.OOP.inheritance;

public class Box {
    double h;
    double l;
    double w;

    // Default constructor
    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // Constructor for a cube
    Box(double side) {
        // super(); // Calls the Object class constructor implicitly
        this.h = side;
        this.l = side;
        this.w = side;
    }

    // Constructor with parameters
    Box(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    // Copy constructor
    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    // Method to display information
    public void information() {
        System.out.println("Running the box");
    }
}
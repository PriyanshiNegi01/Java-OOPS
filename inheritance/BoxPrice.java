package com.priyanshi.OOP.inheritance;

// BoxPrice class extends BoxWeight class
public class BoxPrice extends BoxWeight {
    double cost;

    // Default constructor
    BoxPrice() {
        super(); // Call the superclass constructor
        this.cost = -1;
    }

    // Copy constructor for BoxPrice
    BoxPrice(BoxPrice other) {
        super(other); // Call the superclass constructor
        this.cost = other.cost;
    }

    // Constructor with parameters
    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight); // Call the superclass constructor for superclass variables
        this.cost = cost; // Initializing subclass (current class) variables
    }

    // Constructor for a cube with weight and cost
    public BoxPrice(double side, double weight, double cost) {
        super(side, weight); // Call the superclass constructor
        this.cost = cost;
    }
}

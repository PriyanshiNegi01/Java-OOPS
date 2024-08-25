package com.priyanshi.OOP.inheritance;

// BoxWeight class extends Box class
public class BoxWeight extends Box {
    double weight;

    // Default constructor
    public BoxWeight() {
        this.weight = -1;
    }

    // Copy constructor for BoxWeight
    BoxWeight(BoxWeight other) {
        // We can pass the BoxWeight (subclass) object
        // to the copy constructor of Box (superclass)
        super(other); // Call the superclass constructor
        this.weight = other.weight;
    }

    // Constructor for a cube with weight
    BoxWeight(double side, double weight) {
        super(side); // Call the superclass constructor
        this.weight = weight;
    }

    // Constructor with parameters
    public BoxWeight(double h, double l, double w, double weight) {
        super(h, l, w); // Call the superclass constructor to initialize its members
        this.weight = weight;
    }
}
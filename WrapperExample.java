package com.priyanshi.OOP.intro;

public class WrapperExample {
    public static void main(String[] args) {
        // Example 1: Swap with primitives
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println("After primitive swap: " + a + " " + b);
        // Output: 10 20
        // Explanation: The values will not be swapped because Java passes primitives by value.

        // Example 2: Swap with wrapper classes
        Integer x = 10;
        Integer y = 20;
        swap(x, y);
        System.out.println("After wrapper class swap: " + x + " " + y);
        // Output: 10 20
        // Explanation: Even with wrapper classes, values will not be swapped because Integer is immutable ('final' class).

        // Example 3: Using the 'final' keyword
        final A priya = new A("Priya Negi");
        priya.name = "Other Name";
        System.out.println("Name after modification: " + priya.name);
        // Output: Other Name
        // Explanation: You can modify the object that a final reference points to, but you cannot reassign the reference itself.

        // Uncommenting the following line will cause an error because 'priya' is final.
        // priya = new A("New Object"); // Error: Cannot assign a value to final variable 'priya'

        // Example 4: Garbage collection demonstration
        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name");
            // Explanation: Previous objects will be garbage collected as they become unreachable.
        }
    }

    // Method to swap two integers (doesn't work with primitives or wrapper classes)
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // Method to swap two Integers (won't work because Integer is immutable)
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

// Class A to demonstrate final keyword with non-primitives
class A {
    final int num = 10; // final primitive variable
    String name; // non-final instance variable

    public A(String name) {
        this.name = name;
    }

    // Uncomment to see the garbage collection in action
    // @Override
    // protected void finalize() throws Throwable {
    //     System.out.println("Object is destroyed.");
    // }
}

package com.priyanshi.OOP.staticExample;

public class InnerClasses {
    // outside classes cannot be static
    // Reason: Because it is not itself dependent on any other class
    // But inner classes are dependent on outer classes
    static class Test { // inner classes may or may not be static
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main() {
        Test a = new Test("Priyanshi");
        Test b = new Test("Riya");
        // above 2 lines will show an error if the Test class is not static, since every instance of InnerClasses
        // will have some class Test with it as well.
        // Thus, we cannot use it inside a static method as the class Test is dependent on the object of InnerClasses class

    }
}

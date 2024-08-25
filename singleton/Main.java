package com.priyanshi.OOP.singleton;

public class Main {
    Singleton obj1 = Singleton.getInstance();

    Singleton obj2 = Singleton.getInstance();

    Singleton obj3 = Singleton.getInstance();

    // only 1 object is created in the memory and the reference variable is given to that object only
    // all 3 ref variables are pointing to just 1 object
}

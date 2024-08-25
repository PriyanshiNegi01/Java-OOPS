package com.priyanshi.OOP.singleton;

public class Singleton {
    // if you only want to create one object, you should not allow anyone to call the constructor of the class
    private Singleton () {
        // private => it will only be used in this Singleton.java class
    }

    private static Singleton instance;

    public static Singleton getInstance () {
        // check whether only 1 object is created or not
     if (instance == null) {
         instance = new Singleton();
     }

     return instance;
    }
}

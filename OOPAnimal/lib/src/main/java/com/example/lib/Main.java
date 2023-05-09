package com.example.lib;

public class Main {
    public static void main(String[] args) {

        Bird Dove = new Bird("Mock", "White", 2, true,2);
        System.out.println(Dove.getWings());
        Dove.eat("rats");
        Dove.fly();

    }
}

package com.javago.base.chapter6;

public class AbstractMainTest {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Auto auto = new Auto();

        bicycle.run();  // the bicycle is running!
        bicycle.stop();  // stop on the road

        auto.run();  // the car is running!
        auto.stop();  // stop on the road
    }
}

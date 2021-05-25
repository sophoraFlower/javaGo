package com.javago.base.chapter6;

public class CalculatorMain {

    public static void compute(ICompute compute, int num1, int num2) {
        int result = compute.computer(num1, num2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        compute(new Add(), 2, 3);  // 5
        compute(new Subtract(), 2, 3);  // -1
        compute(new Multiply(), 2, 3);  // 6
        compute(new Divide(), 2, 3);  // 0
    }

}

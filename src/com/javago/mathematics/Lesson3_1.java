package com.javago.mathematics;

public class Lesson3_1 {
    public static long getNumberOfWheat(int grid){
        long sum = 0;
        long numberOfWheatInGrid = 1;

        sum += numberOfWheatInGrid;

        for (int i=2; i<=grid; i++){
            numberOfWheatInGrid *= 2;
            sum += numberOfWheatInGrid;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(String.format("总共给：%d", Lesson3_1.getNumberOfWheat(63)));
    }
}

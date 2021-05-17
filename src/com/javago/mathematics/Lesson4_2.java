package com.javago.mathematics;

class Result {
    public long wheatNum = 0;
    public long wheatTotalNum = 0;
}

public class Lesson4_2 {
    public static boolean prove(int k, Result result){
        if(k==1){
            if((Math.pow(2, 1) - 1) == 1){
                result.wheatNum = 1;
                result.wheatTotalNum = 1;
                return true;
            } else {
                return false;
            }
        } else {
            boolean proveOfPreviousONe = prove(k-1, result);
            result.wheatNum *= 2;
            result.wheatTotalNum += result.wheatNum;
            boolean proveOfCurrentOne = result.wheatTotalNum == (Math.pow(2, k) - 1);
            return proveOfPreviousONe && proveOfCurrentOne;
        }
    }

    public static void main(String[] args) {
        int grid = 63;
        Result result = new Result();
        System.out.println(Lesson4_2.prove(grid, result));
    }
}

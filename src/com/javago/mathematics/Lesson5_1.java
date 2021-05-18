package com.javago.mathematics;

import java.util.ArrayList;

public class Lesson5_1 {
    public static long[] rewards = {1, 2, 5, 10};

    public static void get(long totalReward, ArrayList<Long> result) {
        if (totalReward == 0){
            System.out.println(result);
            return;
        } else if (totalReward < 0) {
            return;
        } else {
            for (long reward : rewards) {
                ArrayList<Long> newResult = (ArrayList<Long>) (result.clone());
                newResult.add(reward);
                get(totalReward - reward, newResult);
            }
        }
    }

    public static void main(String[] args) {
        int totalReward = 10;
        Lesson5_1.get(totalReward, new ArrayList<Long>());
    }
}
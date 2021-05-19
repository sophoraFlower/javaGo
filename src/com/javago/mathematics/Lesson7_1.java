package com.javago.mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Lesson7_1 {
    public static HashMap<String, Double> q_horses_time = new HashMap<String, Double>(){
        {
            put("q1", 1.0);
            put("q2", 2.0);
            put("q3", 3.0);
        }
    };

    public static HashMap<String, Double> t_horses_time = new HashMap<String, Double>(){
        {
            put("t1", 1.5);
            put("t2", 2.5);
            put("t3", 3.5);
        }
    };

    public static ArrayList<String> q_horses = new ArrayList<>(Arrays.asList("q1", "q2", "q3"));

    public static void permutate(ArrayList<String> horses, ArrayList<String> result){
        if (horses.size() == 0){
            System.out.println(result);
            compare(result, q_horses);
            System.out.println();
            return;
        }

        for (int i=0; 0<horses.size(); i++){
            ArrayList<String> new_result = (ArrayList<String>)(result.clone());
            new_result.add(horses.get(i));
            ArrayList<String> rest_horses = (ArrayList<String>)(horses.clone());
            rest_horses.remove(i);
            permutate(rest_horses, new_result);
        }
    }


    public static void compare(ArrayList<String> t, ArrayList<String> q) {
        int t_won_cnt = 0;
        for (int i = 0; i < t.size(); i++) {
            System.out.println(t_horses_time.get(t.get(i)) + " " +  q_horses_time.get(q.get(i)));
            if (t_horses_time.get(t.get(i)) < q_horses_time.get(q.get(i))) t_won_cnt ++;
        }

        if (t_won_cnt > (t.size() / 2)) System.out.println("田忌获胜！");
        else System.out.println("齐王获胜！");

        System.out.println();
    }


    public static void main(String[] args) {

        ArrayList<String> horses = new  ArrayList<>(Arrays.asList("t1", "t2", "t3"));
        Lesson7_1.permutate(horses,  new ArrayList<>());
    }


}

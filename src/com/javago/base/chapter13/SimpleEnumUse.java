package com.javago.base.chapter13;

public class SimpleEnumUse {
    public enum Spiciness {
        NOT, MILD, MEDIUM, HOT, FLAMING
    }

    public static void main(String[] args) {
        Spiciness spiciness = Spiciness.NOT;
        System.out.println(spiciness);  // NOT

        for(Spiciness s : Spiciness.values()){
            System.out.println(s + ".ordinal(): " +s.ordinal());
        }
    }
}

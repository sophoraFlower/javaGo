package com.javago.base.chapter15;

class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return "WaterSource{" +
                "s='" + s + '\'' +
                '}';
    }
}

public class SPrinklerSystem {

    private String value1, value2, value3, value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SPrinklerSystem{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                ", value4='" + value4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        SPrinklerSystem sPrinklerSystem = new SPrinklerSystem();
        System.out.println(sPrinklerSystem);
    }
}

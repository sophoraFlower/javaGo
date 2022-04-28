package code023;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int size = 10;
        double[] doubles = new double[size];
        for(int i=0; i<10; i++) {
            doubles[i] = (Math.random()) * 10;
        }
        for (double d: doubles
             ) {
            System.out.println(String.format("%.2f", d));
        }

        Arrays.sort(doubles);
        for (double d: doubles
        ) {
            System.out.println(String.format("%.2f", d));
        }
    }

}

package code001;

public class ForceConvertValueLoss {

    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 5555555555555L;
        intVal = (int) longVal;
        System.out.println(intVal);  // -2132125469

        float floatVal = 11.32f;
        double doubleVal = 1234567890.123456;
        floatVal = (float) doubleVal;
        System.out.println(floatVal);  // 1.23456794E9
        System.out.println(doubleVal);  // 1.234567890123456E9
    }

}

package code001;

public class AutoConvert {

    public static void main(String[] args) {
        int intVal = 99;
        long longVal = intVal;
        long longVal2 = intVal + 1;
        System.out.println(longVal2);  // 100

        float floatVal = 11.32f;
        double doubleVal = floatVal;
        double doubleVal2 = floatVal * 2;
        System.out.println(doubleVal2);  // 22.639999389648438

        doubleVal = longVal;
        doubleVal = intVal;

        floatVal = intVal;
        floatVal = longVal;

        char ch = 'A';
        int chNum = ch;
        int chNumCalc = ch + 10;
        System.out.println(ch);  // A
        System.out.println(chNum);  // 65
    }

}

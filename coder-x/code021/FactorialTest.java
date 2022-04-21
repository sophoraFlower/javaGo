package code021;

public class FactorialTest {

    private int factorial(int n) {
        if(n <= 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }

    }

    public static void main(String[] args) {
        FactorialTest factorialTest = new FactorialTest();
        int factorialTest_4 = factorialTest.factorial(4);
        System.out.println(factorialTest_4);
    }

}

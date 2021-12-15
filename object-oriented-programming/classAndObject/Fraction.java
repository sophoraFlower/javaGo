ackage classAndObject;

import java.util.Scanner;

public class Fraction {

    private int numerator;
    private int denominator;

    Fraction(int a, int b){
        numerator = a;
        denominator = b;
    }

    // 将分数转换为double
    double toDouble(){
        return numerator*1.0/denominator;
    }

    // 将自己的分数和r的分数相加，产生一个新的Fraction的对象。
    Fraction plus(Fraction r){
        Fraction result = new Fraction(0, 0);
        result.denominator = denominator*r.denominator;
        result.numerator = numerator*r.denominator + r.numerator*denominator;
        return result;
    }

    // 将自己的分数和r的分数相乘，产生一个新的Fraction的对象。
    Fraction multiply(Fraction r){
        Fraction result = new Fraction(0, 0);
        result.denominator = denominator*r.denominator;
        result.numerator = numerator*r.numerator;
        return result;
    }

    // 将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。
    // 如果分数是1/1，应该输出1。当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。
    void print(){
        int x=numerator;
        int y=denominator;
        int tmp;
        if (x == y) {
            System.out.println("1");
        } else {
            while(y != 0){
                tmp = x%y;
                x=y;
                y=tmp;
            }
            numerator=numerator/x;
            denominator=denominator/x;
            System.out.println(numerator+"/"+denominator);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(),in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
    }

}

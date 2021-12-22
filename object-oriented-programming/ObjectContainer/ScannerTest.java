package ObjectContainer;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;
        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
            System.out.println(age);
        } else {
            System.out.println("不是int类型");
        }

        float height;
        if (scanner.hasNextFloat()) {
            height = scanner.nextFloat();
            System.out.println(height);
        } else {
            System.out.println("不是float类型");
        }
    }
}
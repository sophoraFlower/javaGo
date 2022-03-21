package code001;

public class BitOprtUsage {

    public static void main(String[] args) {
        int base = 1;
        int is_student_mask = base;  // 1 > 1
        int is_programmer_mask = base << 1;  // 2 > 10
        int is_driver_mask = base << 2;  //  4 > 100
        int is_painter_mask = base << 3;  //  8 > 1000

        int data = 5;  // 101

        boolean isStudent = (data & is_student_mask) != 0;  // 001 > 1
        System.out.println(isStudent);

        boolean isProgrammer = (data & is_programmer_mask) != 0;  // 000 > 0
        System.out.println(isProgrammer);

        boolean isDriver = (data & is_driver_mask) != 0;  // 100 > 4
        System.out.println(isDriver);

        boolean isPainter = (data & is_painter_mask) != 0;  // 0000 > 0
        System.out.println(isPainter);
    }

}

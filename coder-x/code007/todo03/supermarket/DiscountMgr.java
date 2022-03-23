package code007.todo03.supermarket;

public class DiscountMgr {

    public static double BASE_DISCOUNT = 0.99;
    public static double VIP_DISCOUNT = 0.85;
    public static double SVIP_DISCOUNT = 0.75;

    public static double getDiscount() {
        return BASE_DISCOUNT;
    }
    public static double getDiscount(boolean isVIP) {
        double svipDiscount = (isVIP ? VIP_DISCOUNT : 1);
        return getDiscount() * svipDiscount;
    }

    public static double getDiscount(int svipLevel) {
        double ret = getDiscount() * VIP_DISCOUNT;
        for (int i = 0; i < svipLevel; i++) {
            ret *= SVIP_DISCOUNT;
        }
        return ret;
    }

    public static void getDiscount(String s) {
        System.out.println(s);
    }
    public static int getDiscount(int a, int b) {
        return a > b ? a : b;
    }
    public static boolean getDiscount(int a, int b, int c) {
        return a > b && b > c;
    }
    public static String getDiscount(long abc) {
        return "" + abc;
    }

    public static void main(String[] args) {
        System.out.println(getDiscount());  // 0.99
        System.out.println(getDiscount(true));  // 0.8415
        System.out.println(getDiscount(2));  // 0.47334375000000006
        String s = "string~";
        getDiscount(s);  // string~
        System.out.println(getDiscount(1, 2));  // 2
        System.out.println(getDiscount(1, 2, 3));  // false
        System.out.println(getDiscount(22333L));   // 22333
    }

}

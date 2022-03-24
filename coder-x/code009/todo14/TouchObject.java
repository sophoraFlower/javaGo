package code009.todo14;

import code009.todo14.supermarket.LittleSuperMarket;

public class TouchObject {
    public static void main(String[] args) {
        Object obj = new Object();
        printObj(obj);

        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);
        printObj(superMarket);

        printObj(superMarket.getMerchandiseOf(0));
        printObj(superMarket.getMerchandiseOf(10));
        printObj(superMarket.getMerchandiseOf(100));
    }

    private static void printObj(Object obj) {
        System.out.println("-----" + obj + "的详细内容-----");
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
    }

}

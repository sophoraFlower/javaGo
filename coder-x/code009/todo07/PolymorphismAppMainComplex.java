package code009.todo07;

import code009.todo07.supermarket.LittleSuperMarket;

public class PolymorphismAppMainComplex {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);

        superMarket.getMerchandiseOf(0).describe();
        System.out.println();
        superMarket.getMerchandiseOf(10).describe();
        System.out.println();
        superMarket.getMerchandiseOf(100).describe();
    }
}

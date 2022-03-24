package code009.todo07;

import code009.todo07.supermarket.LittleSuperMarket;

public class PolymorphismAppMainSimple {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);

        /**
         * 执行的方法取决于对象的类型，而非引用的类型:覆盖的精髓。覆盖是多态的一种，是最重要的一种。
         *
         */
        System.out.println(superMarket.getMerchandiseOf(0).getName());
        System.out.println();
        System.out.println(superMarket.getMerchandiseOf(10).getName());
        // 如果子类里没有覆盖这个方法，就去父类里找，父类里没有，就去父类的父类找。反之只要能让一个引用指向这个对象
        System.out.println();
        System.out.println(superMarket.getMerchandiseOf(100).getName());

    }
}

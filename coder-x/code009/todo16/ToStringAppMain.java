package code009.todo16;

import code009.todo16.supermarket.LittleSuperMarket;
import code009.todo16.supermarket.MerchandiseV2;

public class ToStringAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);

        MerchandiseV2 m100 = superMarket.getMerchandiseOf(100);

        StringBuilder strBuilder = new StringBuilder();

        strBuilder.append("商品100是：").append(m100);
        System.out.println(strBuilder.toString());
        System.out.println(m100);
    }

}

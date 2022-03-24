package code009.todo11;

import code009.todo11.supermarket.LittleSuperMarket;
import code009.todo11.supermarket.MerchandiseV2;
import code009.todo11.supermarket.Phone;
import code009.todo11.supermarket.ShellColorChangePhone;

public class OverloadAndOverrideTestAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);
        MerchandiseV2 m = superMarket.getMerchandiseOf(100);
        m.buy(6);

    }
}

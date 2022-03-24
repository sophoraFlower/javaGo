package code009.todo13;

import code009.todo13.supermarket.LittleSuperMarket;
import code009.todo13.supermarket.MerchandiseV2;

public class LittleSuperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);

        MerchandiseV2[] all = superMarket.getMerchandises();
        double maxPurchasePrice = -1;
        for (MerchandiseV2 m : all) {
            if (m.getPurchasePrice() > maxPurchasePrice) {
                maxPurchasePrice = m.getPurchasePrice();
            }
        }

        System.out.println(maxPurchasePrice);
        System.out.println(superMarket.getBiggestPurchasePrice());
    }
}

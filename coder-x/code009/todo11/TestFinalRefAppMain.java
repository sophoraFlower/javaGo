package code009.todo11;

import code009.todo11.supermarket.LittleSuperMarket;
import code009.todo11.supermarket.MerchandiseV2;
import code009.todo11.supermarket.Phone;

public class TestFinalRefAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, 100);
        Phone ph = (Phone) superMarket.getMerchandiseOf(10);

        MerchandiseV2 gift = ph.getGift();

        gift.describe();

        gift.setName("变化一下商品名字？");

        gift.setSoldPrice(9898989);

        gift.describe();

        MerchandiseV2 m0 = superMarket.getMerchandises()[0];

        superMarket.getMerchandises()[0] = gift;

        MerchandiseV2 m0Chanage = superMarket.getMerchandises()[0];

        m0.describe();

        m0Chanage.describe();
    }
}

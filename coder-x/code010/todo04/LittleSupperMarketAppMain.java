package code010.todo04;

import code010.todo04.supermarket.LittleSuperMarket;

public class LittleSupperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);

        superMarket.getBiggestProfitMerchandise().describe();
    }
}

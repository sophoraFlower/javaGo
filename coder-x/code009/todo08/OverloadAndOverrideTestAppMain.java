package code009.todo08;

import code009.todo08.supermarket.LittleSuperMarket;
import code009.todo08.supermarket.MerchandiseV2;
import code009.todo08.supermarket.Phone;
import code009.todo08.supermarket.ShellColorChangePhone;

public class OverloadAndOverrideTestAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);
        MerchandiseV2 m = superMarket.getMerchandiseOf(100);
        if (m instanceof MerchandiseV2){
            System.out.println("m instanceof MerchandiseV2");
        }
        if (m instanceof Phone){
            System.out.println("m instanceof Phone");
        }
        if (m instanceof ShellColorChangePhone){
            System.out.println("m instanceof ShellColorChangePhone");
        }
        m.buy(5);
    }
}

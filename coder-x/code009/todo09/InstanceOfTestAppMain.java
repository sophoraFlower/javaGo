package code009.todo09;

import code009.todo09.supermarket.LittleSuperMarket;
import code009.todo09.supermarket.MerchandiseV2;
import code009.todo09.supermarket.Phone;
import code009.todo09.supermarket.ShellColorChangePhone;

public class InstanceOfTestAppMain {
    public static void main(String[] args) {
        int merchandiseCount = 600;
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, merchandiseCount, 100);

        for(int i =0;i<merchandiseCount;i++){
            MerchandiseV2 m = null;// superMarket.getMerchandiseOf(i);
            if(m instanceof MerchandiseV2){
                MerchandiseV2 ph = (MerchandiseV2)m;
                System.out.println(ph.getName());
            }else {
                System.out.println("not an instance");
            }
        }
    }
}

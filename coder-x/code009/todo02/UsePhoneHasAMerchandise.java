package code009.todo02;

import code009.todo02.supermarket.MerchandiseV2;
import code009.todo02.supermarket.PhoneHasAMerchandise;

public class UsePhoneHasAMerchandise {
    public static void main(String[] args) {
        MerchandiseV2 merchandise = new MerchandiseV2(
            "手机001", "Phone001", 100, 1999, 999);
        PhoneHasAMerchandise phone = new PhoneHasAMerchandise(
            4.5, 3.5, 4, 128, "索尼", "安卓", merchandise);

        // phone.describePhone();
        phone.getMerchandise().describe();
        // 获取该商品名称
        System.out.println(phone.getMerchandise().getName());
        // 购买操作，如果购买数量需要限制，PhoneHasAMerchandise类无法修改
        phone.getMerchandise().buy(100);

    }
}

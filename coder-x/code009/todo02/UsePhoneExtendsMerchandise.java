package code009.todo02;

import code009.todo02.supermarket.MerchandiseV2;
import code009.todo02.supermarket.PhoneExtendsMerchandise;

public class UsePhoneExtendsMerchandise {
    public static void main(String[] args) {
        PhoneExtendsMerchandise phone  = new PhoneExtendsMerchandise(
            "手机001","Phone001",100, 1999, 999,
            4.5,3.5,4,128,"索尼","安卓"
        );

        phone.describePhone();
        phone.buy(100);
        System.out.println(phone.getName());

        MerchandiseV2 phone1 = new MerchandiseV2();
        phone1.describe();

    }
}

package code009.todo05;

import code009.todo05.supermarket.Phone;

public class UsePhoneExtendsMerchandise {
    public static void main(String[] args) {

        Phone ph = new Phone();
        ph.describe();

        Phone ph01 = new Phone("无名", "000", 0, 1, 1.1, 4.5, 4.6, 6, 128, "Uknown", "Uknown");
        ph01.describe();

    }
}

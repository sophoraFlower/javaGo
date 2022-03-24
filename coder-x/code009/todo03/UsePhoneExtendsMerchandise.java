package code009.todo03;

import code009.todo03.supermarket.Phone;

public class UsePhoneExtendsMerchandise {
    public static void main(String[] args) {
        Phone phone = new Phone(
            "手机001", "Phone001", 100, 1999, 999,
            4.5, 3.5, 4, 128, "索尼", "安卓"
        );

        // 子类的方法 > 对应父类的describe()
        phone.describePhone();
        System.out.println();
        System.out.println(phone.getName());
        System.out.println();
        phone.buy(100);
        phone.buy(3);
    }
}

package code009.todo04;

import code009.todo04.supermarket.Phone;

public class UsePhoneExtendsMerchandise {
    public static void main(String[] args) {
        Phone phone = new Phone(
            "手机001", "Phone001", 100, 1999, 999,
            4.5, 3.5, 4, 128, "索尼", "安卓"
        );

        phone.describe();
        System.out.println();
        // System.out.println(phone.getName());
        // System.out.println();
        // phone.buy(100);
        // phone.buy(3);
        // 获取父类里的name属性
        phone.accessParentProps();
        /*
            super.describe();
            super.buy(66);
            System.out.println("父类里的count属性：" + super.count);
         */
        phone.useSuper();

    }
}

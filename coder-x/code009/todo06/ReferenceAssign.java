package code009.todo06;

import code009.todo06.supermarket.MerchandiseV2;
import code009.todo06.supermarket.Phone;
import code009.todo06.supermarket.ShellColorChangePhone;

public class ReferenceAssign {
    public static void main(String[] args) {
        Phone ph = new Phone(
            "手机001", "Phone001", 100, 1999, 999,
            4.5, 3.5, 4, 128, "索尼", "安卓"
        );

        // 可以用子类的引用给父类的引用赋值，也就是说，父类的引用可以指向子类的对象
        MerchandiseV2 m = ph;
        MerchandiseV2 m2 = new Phone(
            "手机002", "Phone002", 100, 1999, 999,
            4.5, 3.5, 4, 128, "索尼", "安卓"
        );

        // 反之则不行，不能让子类的引用指向父类的对象。因为父类并没有子类的属性和方法呀
        // Phone notDoable = new MerchandiseV2();

        /**
         * 因为子类继承了父类的方法和属性，所以父类的对象能做到的，子类的对象肯定能做到
         * 当父类的引用指向子类的实例（或者父类的实例），只能通过父类的引用，像父类一样操作子类的对象
         */

        ph.getBrand();
        // m.getBrand();

        if (m2 instanceof Phone){
            Phone aPhone = (Phone) m2;
        }
        // MerchandiseV2是Phone的父类，Phone是shellColorChangePhone的父类
        ShellColorChangePhone shellColorChangePhone = new ShellColorChangePhone(
            "手机002", "Phone002", 100, 1999, 999,
            4.5, 3.5, 4, 128, "索尼", "安卓"
        );

        MerchandiseV2 ccm = shellColorChangePhone;
        Phone ccp = (Phone) ccm;

        // ccm > MerchandiseV2 > ShellColorChangePhone实例
        // 继承关系：ShellColorChangePhone extends Phone
        // 继承关系：Phone extends MerchandiseV2
        ShellColorChangePhone scp = (ShellColorChangePhone) ccm;
        // m2 > MerchandiseV2 > Phone实例
        // 继承关系：ShellColorChangePhone extends Phone
        // 继承关系：Phone extends MerchandiseV2
        // 将父类型的对象实例强制转化为子类型，报错：ClassCastException
        ShellColorChangePhone notCCP = (ShellColorChangePhone) m2;  // ClassCastException

    }
}

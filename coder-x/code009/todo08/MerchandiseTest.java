package code009.todo08;

import code009.todo08.supermarket.MerchandiseV2;
import code009.todo08.supermarket.Phone;
import code009.todo08.supermarket.ShellColorChangePhone;

public class MerchandiseTest {

    public void testMerchandiseOverload(MerchandiseV2 me) {
        System.out.println("参数为MerchandiseV2的testMerchandiseOverload 被调用了");
    }

    public void testMerchandiseOverload(Phone ph) {
        System.out.println("参数为Phone的testMerchandiseOverload 被调用了");
    }

    public void testMerchandiseOverload(ShellColorChangePhone shellColorChangePhone) {
        System.out.println("参数为ShellColorChangePhone的testMerchandiseOverload 被调用了");
    }

    public void testMerchandiseOverload(String str) {
        System.out.println("参数为String的testMerchandiseOverload 被调用了");
    }

    public void testMerchandiseOverloadNotExactlyMatchType(MerchandiseV2 me) {
        System.out.println("参数为MerchandiseV2的testMerchandiseOverloadNotExactlyMatchType 被调用了");
    }

    public void testMerchandiseOverloadNotExactlyMatchType(String str) {
        System.out.println("参数为String的testMerchandiseOverloadNotExactlyMatchType 被调用了");
    }

}

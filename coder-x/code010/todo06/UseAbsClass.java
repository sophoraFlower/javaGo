package code010.todo06;

import code010.todo06.supermarket.*;

import java.util.Date;

public class UseAbsClass {
    public static void main(String[] args) {
        Date produceDate = new Date();
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);

        // 父类的引用可以用子类的引用赋值，抽象类也一样
        AbstractExpireDateMerchandise am = new GamePointCard(
            "点卡001", "点卡001", 100, 1999, 999,
            produceDate, expireDate
        );
        am.describe();
    }
}

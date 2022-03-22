package code005.marketV3.supermarket;

public class MerchandiseV2 {

    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
            + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
            "。销售一个的毛利润是" + (soldPrice - purchasePrice));
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        return profit;
    }

    public void duplicateName() {
        int count;
        this.count = 999;
        count = 999;
    }

    public void addCount(int count) {
        this.count += count;

        System.out.println("MerchandiseV2的addCount方法使用的对象是：" + this);
    }

    public boolean hasEnoughCountFor(int count) {
        System.out.println("MerchandiseV2的hasEnoughCountFor方法使用的对象是：" + this);

        return this.count >= count;
    }

}
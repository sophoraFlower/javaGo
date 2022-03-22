package code005.marketV4.supermarket;

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

    // 获取商品库存
    public int getCount() {
        return count;
    }
    // 增加商品库存
    public void addCount(int count) {
        this.count += count;
    }
    // 判断库存是否足够
    public boolean hasEnoughCountFor(int count) {
        return this.count >= count;
    }
    // 计算需要增加的库存
    public void makeEnoughFor(int count) {
        boolean hasEnough = hasEnoughCountFor(count);
        if (!hasEnough) {
            int toBeAdd = count - this.count;
            addCount(toBeAdd);
        }
    }
    // 逐次增加库存，每次指定数，直到库存正常
    public void makeEnoughForOneByOne(int count) {
        boolean hasEnough = this.hasEnoughCountFor(count);
        if (!hasEnough) {
            this.addCount(1);
            makeEnoughForOneByOne(count);
        }
    }

}
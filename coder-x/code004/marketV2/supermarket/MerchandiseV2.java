package code004.marketV2.supermarket;

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

    // 计算商品单件利润
    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        if(profit <= 0){
            return 0;
        }
        return profit;
    }

    // 购买操作。返回花费总数（第2件半价）
    // 如果返回值是负数，就代表购买失败，比如库存不足
    public double buy(int countToBuy) {
        if (count < countToBuy) {
            System.out.println("商品库存不够");
            return -1;
        }
        System.out.println("商品单价为" + soldPrice);
        // 商品全价购数
        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        // 商品半价购买数
        int halfPriceCount = countToBuy - fullPriceCount;
        // 总的花费计算
        double totalCost = soldPrice * fullPriceCount + halfPriceCount * soldPrice / 2;
        count -= countToBuy;
        return totalCost;
    }

    public double buyAndPrintLeft(int countToBuy, boolean printLeft) {
        if (count < countToBuy) {
            System.out.println("商品库存不够");
            if (printLeft) {
                System.out.println("商品剩余库存为" + count);
            }
            return -1;
        }

        System.out.println("商品单价为" + soldPrice);
        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        int halfPriceCount = countToBuy - fullPriceCount;
        double totalCost = soldPrice * fullPriceCount + halfPriceCount * soldPrice / 2;
        count -= countToBuy;
        if (printLeft) {
            System.out.println("商品剩余库存为：" + count);
        }
        return totalCost;
    }

    // 比较用户购买商品的价值和指定商品的价值
    public boolean totalValueBiggerThan(MerchandiseV2 merchandiseV2) {
        return count * purchasePrice > merchandiseV2.purchasePrice * merchandiseV2.count;
    }

    // 判断指定商品是否为超市里价值最高的
    public boolean isTheBiggestTotalValueOne(LittleSuperMarket littleSuperMarket) {
        double totalValue = count * purchasePrice;
        for (int i = 0; i < littleSuperMarket.merchandises.length; i++) {
            MerchandiseV2 m = littleSuperMarket.merchandises[i];
            double newTotalValue = m.count * m.purchasePrice;
            if (totalValue < newTotalValue) {
                return false;
            }
        }
        return true;
    }
}

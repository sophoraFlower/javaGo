package ObjectContainer;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {

    private HashMap<Integer, String> coinNames = new HashMap<Integer, String>();

    public Coin(){
        coinNames.put(1, "penny");
        coinNames.put(10, "dime");
        coinNames.put(25, "quarter");
        coinNames.put(50, "half-dollar");
    }

    public String getName(int amount){
        if(coinNames.containsKey(amount)){
            return coinNames.get(amount);
        }else{
            return "NOT FOUND";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        Coin coin = new Coin();
        String name = coin.getName(amount);
        System.out.println(name);

        // 通过foreach循环遍历
        for (Integer k : coin.coinNames.keySet()){
            String s = coin.coinNames.get(k);
            System.out.println(s);
        }
    }

}
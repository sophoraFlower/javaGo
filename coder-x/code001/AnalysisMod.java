package code001;

public class AnalysisMod {

    public static void main(String[] args) {
        // 生成[0 1)范围的随机数
        double randNum = Math.random();  // [0 1)
        System.out.println(randNum);
        // 生成[0 1]范围的随机整数
        for(int i=0; i<=100; i++){
            System.out.println((int)(i*randNum) % 2);
        }
        // 生成[0 100]范围的随机整数
        for(int i=0; i<=100; i++){
            System.out.println((int)(i*100*randNum) % 101);
        }
        // 生成[99 180]范围的随机整数
        for(int i=0; i<=100; i++){
            int mod = 180-99;
            // 生成[0 81]范围的随机整数
            System.out.println(99 + (int)(i*180*randNum) % (mod+1));
        }
    }

}

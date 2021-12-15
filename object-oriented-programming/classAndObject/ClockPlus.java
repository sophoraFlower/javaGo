package classAndObject;

public class ClockPlusTest {

    private Display hour = new Display(24);
    private Display minute = new Display(60);
    private Display second = new Display(60);

    public ClockPlusTest(int hour, int minute, int second){
        this.hour.setValue(hour);
        this.minute.setValue(minute);
        this.second.setValue(second);
    }

    // “嘀嗒”一下，时间走1秒。
    public void tick() throws InterruptedException {
        second.increase();
        Thread.sleep(1000);
        System.out.println("嘀嗒");
    }

    public void start() throws InterruptedException {
        while(true){
            tick();
            if(second.getValue() == 0){
                minute.increase();
                if(minute.getValue() == 0){
                    hour.increase();
                }
            }
            System.out.println(this.toString());
        }
    }

    // 返回一个String的值，以“hh:mm:ss“的形式表示当前时间。这里每个数值都占据两位，不足两位时补0。
    // 如“00:01:22"。注意其中的冒号是西文的，不是中文的。
    public String toString(){
        return String.format("%,2d:%,2d:%,2d", hour.getValue(), minute.getValue(), second.getValue());
    }


    public static void main(String[] args) throws InterruptedException {
        ClockPlusTest cp = new ClockPlusTest(13, 20, 20);
        cp.start();
    }

}

package classAndObject;

public class ClockBoolean {

    private DisplayBoolean hour = new DisplayBoolean(24);
    private DisplayBoolean minute = new DisplayBoolean(60);

    public void start(){
        while(true){
            minute.increase();
            if(minute.increase()){
                hour.increase();
            }
            System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.start();
    }

}

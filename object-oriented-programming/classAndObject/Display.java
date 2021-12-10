package classAndObject;

public class Display {

    private int value = 0;
    private int limlit = 0;

    public Display(int limit){
        this.limlit = limit;
    }

    public void increase(){
        value++;
        if(value == limlit){
            value = 0;
        }
    }

    public int getValue(){
        return value;
    }

    public static void main(String[] args) {
        Display d = new Display(24);
        for(;;){
            d.increase();
            System.out.println(d.getValue());
        }

    }

}

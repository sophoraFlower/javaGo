package classAndObject;

public class DisplayBoolean {

    private int value = 0;
    private int limlit = 0;

    public DisplayBoolean(int limit){
        this.limlit = limit;
    }

    public boolean increase(){
        value++;
        if(value == limlit){
            value = 0;
            return true;
        }else{
            return false;
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

package Interfaces.field;

public class Location {
    private int x;
    private int y;
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getRow() {
        return x;
    }

    public int getCol() {
        return y;
    }
}
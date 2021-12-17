package InheritanceAndPolymorphism;

public class DVD extends CD{
    public DVD(String title, String director, int playingTime, String comment) {
        super(title, director, playingTime, comment);
    }

    private boolean isDVD = true;
    public boolean isDVD() {
        return isDVD;
    }
    public void setDVD(boolean DVD) {
        isDVD = DVD;
    }

}

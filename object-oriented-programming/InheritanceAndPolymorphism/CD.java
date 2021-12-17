package InheritanceAndPolymorphism;

public class CD {

    private String title;
    private String director;
    private int playingTime;
    private String comment;
    private boolean gotIt = false;

    public CD(String title, String director, int playingTime, String comment) {
        this.title = title;
        this.director = director;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isGotIt() {
        return gotIt;
    }

    public void setGotIt(boolean gotIt) {
        this.gotIt = gotIt;
    }

    @Override
    public String toString() {
        return "CD{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", playingTime=" + playingTime +
                ", comment='" + comment + '\'' +
                ", gotIt=" + gotIt +
                '}';
    }

}

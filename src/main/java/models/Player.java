package models;

public class Player {
    private City city;
    public static final int INITIAL_LEVEL = 1;
    public static final int INITIAL_ID = 1;


    public void play() {
        this.city = new City(INITIAL_LEVEL, INITIAL_ID);
    }
}

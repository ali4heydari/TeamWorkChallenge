package models;

import interfaces.Destroyable;

public abstract class Phenom implements Destroyable {
    protected int level;
    protected int id;
    protected int lifeDays;
    private static final int DEFAULT_LEVEL = 1;
    private static final int DEFAULT_ID = 1;

    public Phenom(int level, int id) {
        setLevel(level);
        setId(id);
    }

    public Phenom() {
        setLevel(DEFAULT_LEVEL);
        setId(DEFAULT_ID);

    }

    public int getLifeDays() {
        return lifeDays;
    }

    public void setLifeDays(int lifeDays) {
        this.lifeDays = lifeDays;
    }

    public int getLevel() {
        return level;
    }

    protected void setLevel(int level) {
        this.level = level;
    }

        public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

}

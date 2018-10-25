package models;


import interfaces.Upgradable;

import java.util.ArrayList;

public class City  extends Phenom implements Upgradable {
    private ArrayList<Block> blocks;
    private static final int INITIAL_FUND = 30000;
    private int fund;

    public City(int level, int id, int fund) {
        super(level, id);
        setFund(fund);
        setBlocks(new ArrayList<Block>());
    }

    public City(int level, int id) {
        this(level,id, INITIAL_FUND);
    }

    public ArrayList<Block> getBlocks() {
        return blocks;
    }

    private void setBlocks(ArrayList<Block> blocks) {
        this.blocks = blocks;
    }

    public static int getInitialFund() {
        return INITIAL_FUND;
    }

    public int getFund() {
        return fund;
    }

    private void setFund(int fund) {
        this.fund = fund;
    }

    public void destroy() {

    }

    public void Upgrade() {

    }
}

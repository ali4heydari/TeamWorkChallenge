package models;


import interfaces.Upgradable;

import java.util.HashMap;

public class City extends Phenom implements Upgradable {
    private HashMap<Integer, Block> blocks = new HashMap();
    private static final int INITIAL_FUND = 30000;
    private static final int ADD_BLOCK_COST = 1000;
    private static final int REMOVE_BLOCK_COST = -500;

    private int fund;

    public City(int level, int id, int fund) {
        super(level, id);
        setFund(fund);
    }

    public City(int level, int id) {
        this(level, id, INITIAL_FUND);
    }

    public HashMap getBlocks() {
        return blocks;
    }

    public boolean setBlocks(HashMap blocks) {
        this.blocks = blocks;
        return true;
    }

    public boolean addBlock(Block block) {
        if (this.getFund() < ADD_BLOCK_COST)
            return false;
        else
            this.setFund(this.getFund() - ADD_BLOCK_COST);
        blocks.put(blocks.size(), block);
        return true;
    }

    public int getFund() {
        return fund;
    }

    private void setFund(int fund) {
        this.fund = fund;
    }

    public void destroy() {

    }

    public boolean Upgrade(int blockId) {
        try {
            if (this.getFund() < Math.pow(500, blocks.get(blockId).getLevel()))
                throw new Exception();
            this.setFund(this.getFund() - (int) Math.pow(500, blocks.get(blockId).getLevel()));
            blocks.get(blockId).addCapacity();
            blocks.get(blockId).setLevel(blocks.get(blockId).getLevel() + 1);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeBlock(int blockId) {
        try {
            if (this.getFund() < REMOVE_BLOCK_COST)
                throw new Exception();
            this.setFund(this.getFund() - REMOVE_BLOCK_COST);
            blocks.remove(blockId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}

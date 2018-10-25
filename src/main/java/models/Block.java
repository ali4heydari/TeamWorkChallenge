package models;

import interfaces.Upgradable;

import java.util.ArrayList;

public class Block extends Phenom implements Upgradable {
    ArrayList<Home> homes;
    private Defender defence;
    Attacker attacker;
    final static int INITIAL_CAPASITY = 15;
    private int capacity = INITIAL_CAPASITY ;

    public void addCapacity() {
        this.capacity +=5;
    }

    public void Upgrade() {

    }

    public void destroy() {

    }

    public boolean Upgrade(int id) {
        return false;
    }
}

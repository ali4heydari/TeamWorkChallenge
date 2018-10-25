package models;

import interfaces.Upgradable;

public class Attack extends Army{
    private Attack _instance;


    private Attack() {
        return;
    }

    public Attack get_instance() {
        return _instance;
    }

    public void Upgrade() {

    }
}


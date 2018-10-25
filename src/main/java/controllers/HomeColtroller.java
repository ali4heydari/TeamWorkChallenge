package controllers;

import models.Home;
import views.HomeView;

public class HomeColtroller {
    private Home home;
    private HomeView homeView;

    public HomeColtroller(Home home) {
        this.home = home;
    }

    public boolean addFloor() {
        return false;
    }

    public boolean removeFloor() {
        return false;
    }
}

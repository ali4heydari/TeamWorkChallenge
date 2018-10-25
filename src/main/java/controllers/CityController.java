package controllers;

import models.City;
import views.CityView;

public class CityController {
    private City city;
    private CityView cityView;

    public CityController(City city) {
        this.city = city;
    }

    public boolean setFund() {

        return this.city.setBlocks(city.getBlocks());
    }

    public boolean addBlock() {
        return false;
    }

    public boolean removeBlock() {

        return false;
    }
}

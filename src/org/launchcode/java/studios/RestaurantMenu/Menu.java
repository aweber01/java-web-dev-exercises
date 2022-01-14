package org.launchcode.java.studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList appetizers = new ArrayList<>();
    private ArrayList mains = new ArrayList<>();
    private ArrayList desserts = new ArrayList<>();
    private Date lastUpdated;

    public Menu(ArrayList appetizers, ArrayList mains, ArrayList desserts, Date lastUpdated) {
        this.appetizers = appetizers;
        this.mains = mains;
        this.desserts = desserts;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList getAppetizers() {
        return appetizers;
    }

    public void setAppetizers(ArrayList appetizers) {
        this.appetizers = appetizers;
    }

    public ArrayList getMains() {
        return mains;
    }

    public void setMains(ArrayList mains) {
        this.mains = mains;
    }

    public ArrayList getDesserts() {
        return desserts;
    }

    public void setDesserts(ArrayList desserts) {
        this.desserts = desserts;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}

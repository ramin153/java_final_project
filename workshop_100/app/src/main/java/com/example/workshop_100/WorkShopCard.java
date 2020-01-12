package com.example.workshop_100;

public class WorkShopCard {
    String name;
    String mananger;
    int price;

    public WorkShopCard(String name, String mananger, int price) {
        this.name = name;
        this.mananger = mananger;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMananger() {
        return mananger;
    }

    public void setMananger(String mananger) {
        this.mananger = mananger;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

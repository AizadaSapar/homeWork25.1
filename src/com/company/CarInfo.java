package com.company;

public class CarInfo {
    private int ageVipusk;
    private String model;
    private int price;
    private String color;

    public CarInfo(int ageVipusk, String model, int price, String color) {
        this.ageVipusk = ageVipusk;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public CarInfo() {
    }

    public int getAgeVipusk() {
        return this.ageVipusk;
    }

    public String getModel() {
        return this.model;
    }

    public int getPrice() {
        return this.price;
    }

    public String getColor() {
        return this.color;
    }

    public void setAgeVipusk(int ageVipusk) {
        this.ageVipusk = ageVipusk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "| CarInfo Vipusk: " + this.getAgeVipusk() + ", model: " + this.getModel() + ", price: " + this.getPrice() + " $" + ", color: " + this.getColor();
    }
}

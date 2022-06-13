package com.company;

public class Car {
    private int id;
    private int numberAuto;

    public Car(int id, int numberAuto) {
        this.id = id;
        this.numberAuto = numberAuto;
    }

    public Car() {
    }

    public int getId() {
        return this.id;
    }

    public int getNumberAuto() {
        return this.numberAuto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumberAuto(int numberAuto) {
        this.numberAuto = numberAuto;
    }

    public String toString() {
        return "Car id: " + this.getId() + ", numberAuto: " + this.getNumberAuto() + " |";
    }
}

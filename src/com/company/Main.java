package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Car, CarInfo> cars = new HashMap<>();
        cars.put(new Car(783, 2515), new CarInfo(2000, "Honda", 10000, "Silver"));
        cars.put(new Car(456, 5888), new CarInfo(2016, "Toyota", 8000, "Red"));
        cars.put(new Car(789, 1505), new CarInfo(2001, "Mazda", 4500, "Black"));
        cars.put(new Car(223, 5585), new CarInfo(2014, "BMW", 70000, "Wight"));
        cars.put(new Car(171, 1407), new CarInfo(2008, "Nissan", 8600, "Yellow"));

        for (Map.Entry<Car, CarInfo> a : cars.entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }
}

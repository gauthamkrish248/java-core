package com.learning.core.day06;

import java.util.*;

public class D06P07 {
	public static void main(String[] args) {
        TreeMap<Car, String> cars = new TreeMap<>();

        cars.put(new Car("Bugatti", 80050.0), "Bugatti");
        cars.put(new Car("Swift", 305000.0), "Swift");
        cars.put(new Car("Audi", 600100.0), "Audi");
        cars.put(new Car("Benz", 900000.0), "Benz");

        Map.Entry<Car, String> greatestPriceEntry = null;
        double maxPrice = Double.MIN_VALUE;
        for (Map.Entry<Car, String> entry : cars.entrySet()) {
            if (entry.getKey().getPrice() > maxPrice) {
                maxPrice = entry.getKey().getPrice();
                greatestPriceEntry = entry;
            }
        }

        Map.Entry<Car, String> leastPriceEntry = null;
        double minPrice = Double.MAX_VALUE;
        for (Map.Entry<Car, String> entry : cars.entrySet()) {
            if (entry.getKey().getPrice() < minPrice) {
                minPrice = entry.getKey().getPrice();
                leastPriceEntry = entry;
            }
        }

        System.out.println(greatestPriceEntry.getValue() + " " + greatestPriceEntry.getKey().getPrice());
        System.out.println(leastPriceEntry.getValue() + " " + leastPriceEntry.getKey().getPrice());
    }
}
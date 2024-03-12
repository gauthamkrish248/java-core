package com.learning.core.day06;
import java.util.*;

import java.util.*;

class Car8 implements Comparable<Car8> {
    private String name;
    private double price;

    public Car8(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car8)) return false;
        Car8 other = (Car8) obj;
        return Objects.equals(name, other.name) && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
    }

    @Override
    public int compareTo(Car8 other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P08 {
    public static void main(String[] args) {
        TreeMap<Car8, String> cars = new TreeMap<>();

        cars.put(new Car8("Bugatti", 80050.0), "Bugatti");
        cars.put(new Car8("Swift", 305000.0), "Swift");
        cars.put(new Car8("Audi", 600100.0), "Audi");
        cars.put(new Car8("Benz", 900000.0), "Benz");

        Map.Entry<Car8, String> greatestPriceEntry = cars.pollFirstEntry(); // Use pollFirstEntry() to remove the first (highest) entry

        System.out.println(greatestPriceEntry.getValue() + " " + greatestPriceEntry.getKey().getPrice());

        for (Map.Entry<Car8, String> entry : cars.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey().getPrice());
        }
    }
}


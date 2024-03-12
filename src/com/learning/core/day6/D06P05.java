package com.learning.core.day06;

import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
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
        if (!(obj instanceof Car)) return false;
        Car other = (Car) obj;
        return Objects.equals(name, other.name) && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
    }

    @Override
    public int compareTo(Car other) {
        return this.name.compareTo(other.name);
    }
}

public class D06P05 {
    public static void main(String[] args) {
        LinkedHashMap<Car, String> cars = new LinkedHashMap<>();

        cars.put(new Car("Bugatti", 80050.0), "Bugatti");
        cars.put(new Car("Swift", 305000.0), "Swift");
        cars.put(new Car("Audi", 600100.0), "Audi");
        cars.put(new Car("Benz", 900000.0), "Benz");

        System.out.println("Car Details:");
        for (Map.Entry<Car, String> entry : cars.entrySet()) {
            Car car = entry.getKey();
            System.out.println(car.getName() + " " + car.getPrice());
        }
    }
}


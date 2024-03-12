package com.learning.core.day06;

import java.util.*;

class Car9 implements Comparable<Car9> {
    String name;
    private double price;

    public Car9(String name, double price) {
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
        if (obj == null || getClass() != obj.getClass()) return false;
        Car9 car = (Car9) obj;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car9 o) {
        return Double.compare(this.price, o.price);
    }
}

public class D06P09 {
    public static void main(String[] args) {
        TreeMap<Car9, String> carMap = new TreeMap<>();

        carMap.put(new Car9("Bugatti", 80050.0), "Bugatti");
        carMap.put(new Car9("Swift", 305000.0), "Swift");
        carMap.put(new Car9("Audi", 600100.0), "Audi");
        carMap.put(new Car9("Benz", 900000.0), "Benz");

        System.out.println("TreeMap before replacement:");
        for (Map.Entry<Car9, String> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the price to replace: ");
        double newPrice = scanner.nextDouble();

        for (Map.Entry<Car9, String> entry : carMap.entrySet()) {
            if (entry.getKey().getPrice() == newPrice) {
                entry.getKey().name = "Reva";
                System.out.println(entry.getKey().getName() + " " + entry.getKey().getPrice() + " -> " + entry.getValue());
                break;
            }
        }
    }
}
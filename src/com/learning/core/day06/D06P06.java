package com.learning.core.day06;

import java.util.*;

public class D06P06 {
	public static void main(String[] args) {
        List<Car> carsList = new ArrayList<>();

        carsList.add(new Car("Bugatti", 80050.0));
        carsList.add(new Car("Swift", 305000.0));
        carsList.add(new Car("Audi", 600100.0));
        carsList.add(new Car("Benz", 900000.0));

        System.out.println("Prices of Cars in Reverse Order:");
        for (int i = carsList.size() - 1; i >= 0; i--) {
            Car car = carsList.get(i);
            System.out.println(car.getName() + " " + car.getPrice());
        }
    }
}

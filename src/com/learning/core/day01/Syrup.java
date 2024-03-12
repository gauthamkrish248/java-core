package com.learning.core.day01;

public class Syrup implements MedicineInfo {

	@Override
	public void displayLabel() {
		System.out.println("Syrup: Syrup is consumable only on Prescription");
	}
}

package com.learning.core.day01;

public class D01P02 {
	public static void main(String[] args) {
		MedicineInfo tablet = new Tablet();
		MedicineInfo syrup = new Syrup();
		MedicineInfo ointment = new Ointment();
		
		displayLabelInformation(tablet);
        displayLabelInformation(syrup);
        displayLabelInformation(ointment);
	}
	
	public static void displayLabelInformation(MedicineInfo medicine) {
		medicine.displayLabel();
	}
}

package com.john.phone;

public class Nokia extends Phone implements Ringable{

	public Nokia(String brand, int batteryPercentage, String carrier, String oS) {
		super(brand, batteryPercentage, carrier, oS);
		
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ring() {
		System.out.println("DO ODOO DODOODD ...");
	}

}

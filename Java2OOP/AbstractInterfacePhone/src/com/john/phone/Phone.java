package com.john.phone;

public abstract class Phone {
	
	private String brand;
	private int batteryPercentage;
	private String carrier;
	private String os;
	
	public Phone(String brand, int batteryPercentage, String carrier, String oS) {
		this.brand = brand;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.os = oS;
	}

//	methods =======

	public abstract void displayInfo();

//	=== GETTERS AND SETTERS ===
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getOS() {
		return os;
	}
	public void setOS(String oS) {
		os = oS;
	}
	

}

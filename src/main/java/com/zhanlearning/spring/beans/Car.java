package com.zhanlearning.spring.beans;

public class Car {

	private String brand; 
	private String corp; 
	private int price; 
	private int maxSpeed;
	
	public Car(String brand, String corp, int price) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}

	
//	public Car(String brand, String corp, int maxSpeed) {
//		super();
//		this.brand = brand;
//		this.corp = corp;
//		this.maxSpeed = maxSpeed;
//	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	} 
	
	
}

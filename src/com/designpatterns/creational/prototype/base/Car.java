package com.designpatterns.creational.prototype.base;

public abstract class Car {
	
	private int horsePower;
	private int numberOfSeats;
	private String color;
	
	public Car() {
		
	}
	
	public Car(Car target) {
		super();
		this.horsePower = target.horsePower;
		this.numberOfSeats = target.numberOfSeats;
		this.color = target.color;
	}

	public abstract Car clone();

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

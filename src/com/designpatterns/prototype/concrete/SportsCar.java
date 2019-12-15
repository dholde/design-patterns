package com.designpatterns.prototype.concrete;

import com.designpatterns.prototype.base.Car;

public class SportsCar extends Car {

	private boolean isCabriolet;
	
	public SportsCar() {
		
	}

	public SportsCar(SportsCar target) {
		super(target);
		if (target != null) {
			this.isCabriolet = target.isCabriolet;
		}
	}

	@Override
	public Car clone() {
		return new SportsCar(this);
	}

	public boolean isCabriolet() {
		return isCabriolet;
	}

	public void setCabriolet(boolean isCabriolet) {
		this.isCabriolet = isCabriolet;
	}
	

}

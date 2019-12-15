package com.designpatterns.creational.prototype;

import com.designpatterns.PatternExampleRunner;
import com.designpatterns.creational.prototype.base.Car;
import com.designpatterns.creational.prototype.concrete.SportsCar;

public class PrototypePatternRunner implements PatternExampleRunner {

	@Override
	public void runPattern(){
		SportsCar porsche = new SportsCar();
		porsche.setCabriolet(true);
		porsche.setColor("Red");
		porsche.setNumberOfSeats(2);
		
		Car newPorsche = porsche.clone();
		
		compareClone(porsche, newPorsche);
	}

	private static void compareClone(SportsCar sportsCarOriginal, Car clone) {
		if(!(clone instanceof SportsCar)) {
			System.out.println("Warning! The cloned object is not a sports car!");
			return;
		}
		if (sportsCarOriginal.getColor().equals(clone.getColor()) 
				&& sportsCarOriginal.getHorsePower() == clone.getHorsePower() 
				&& sportsCarOriginal.getNumberOfSeats() == clone.getNumberOfSeats()) {
			System.out.println("Wow! It's a perfect clone!");
		} else {
			System.out.println("Warning! The cloned sports car is not an exact clone of the original!");
		}
	}
}

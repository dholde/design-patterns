package com.designpatterns.builder.product.concrete;

import com.designpatterns.builder.product.base.Creature;

public class HomoSapiens implements Creature {
	
	private int numberOfEyes;
	private int numberOfExtremeties;
	private boolean hasBones;
	

	public HomoSapiens(int numberOfEyes, int numberOfExtremeties, boolean hasBones) {
		super();
		this.numberOfEyes = numberOfEyes;
		this.numberOfExtremeties = numberOfExtremeties;
		this.hasBones = hasBones;
	}

	@Override
	public void move() {
		System.out.println("I go on my two legs");
	}

	@Override
	public void sleep() {
		System.out.println("I go to sleep for minimum eight hours (credits to Matthew Walker)");
	}

	@Override
	public void wakeUp() {
		System.out.println("I wake up now.");
	}

	@Override
	public void eat() {
		System.out.println("I eat some junkfood");
	}
	
	@Override
	public String toString() {
		return "\n- " + this.getNumberOfEyes() + " eyes"
				+ "\n- " + this.getNumberOfExtremeties() + " extremeties"
				+ "\n- " + (this.isHasBones() == true ? "Several Bones" : "No Bones");
	}

	public int getNumberOfEyes() {
		return numberOfEyes;
	}

	public void setNumberOfEyes(int numberOfEyes) {
		this.numberOfEyes = numberOfEyes;
	}

	public int getNumberOfExtremeties() {
		return numberOfExtremeties;
	}

	public void setNumberOfExtremeties(int numberOfExtremeties) {
		this.numberOfExtremeties = numberOfExtremeties;
	}

	public boolean isHasBones() {
		return hasBones;
	}

	public void setHasBones(boolean hasBones) {
		this.hasBones = hasBones;
	}

	
}

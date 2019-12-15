package com.designpatterns.creational.builder.concrete;

import com.designpatterns.creational.builder.base.CreatureBuilder;
import com.designpatterns.creational.builder.product.base.Creature;
import com.designpatterns.creational.builder.product.concrete.SinopodaScurion;

public class SinopodaScurionBuilder implements CreatureBuilder {
	
	private int numberOfEyes;
	private int numberOfExtremeties;
	private boolean hasBones;

	@Override
	public void setNumberOfEyes(int numberOfEyes) {
		this.numberOfEyes = numberOfEyes;
	}

	@Override
	public void setNumberOfExtremeties(int numberOfExtremeties) {
		this.numberOfExtremeties = numberOfExtremeties;
	}

	@Override
	public void setHasBones(boolean hasBones) {
		this.hasBones = hasBones;
	}

	@Override
	public Creature getResult() {
		return new SinopodaScurion(numberOfEyes, numberOfExtremeties, hasBones);
	}

}

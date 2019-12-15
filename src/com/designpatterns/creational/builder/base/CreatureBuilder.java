package com.designpatterns.creational.builder.base;

import com.designpatterns.creational.builder.product.base.Creature;

public interface CreatureBuilder {
	
	public void setNumberOfEyes(int numberOfEyes);
	public void setNumberOfExtremeties(int numberOfExtremeties);
	public void setHasBones(boolean hasBones);
	public Creature getResult();

}

package com.designpatterns.builder.base;

import com.designpatterns.builder.product.base.Creature;

public interface CreatureBuilder {
	
	public void setNumberOfEyes(int numberOfEyes);
	public void setNumberOfExtremeties(int numberOfExtremeties);
	public void setHasBones(boolean hasBones);
	public Creature getResult();

}

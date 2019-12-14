package com.designpatterns.builder.director;

import com.designpatterns.builder.base.CreatureBuilder;
import com.designpatterns.builder.product.base.Creature;

public class God {
	
	public Creature createHomoSapiens(CreatureBuilder builder) {
		builder.setNumberOfEyes(2);
		builder.setNumberOfExtremeties(4);
		builder.setHasBones(true);
		return builder.getResult();
	}
	
	public Creature createSinopodaScurion(CreatureBuilder builder) {
		builder.setNumberOfEyes(0);
		builder.setNumberOfExtremeties(8);
		builder.setHasBones(false);
		return builder.getResult();
	}

}

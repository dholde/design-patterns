package com.designpatterns.builder;

import com.designpatterns.PatternExampleRunner;
import com.designpatterns.builder.concrete.HomoSapiensBuilder;
import com.designpatterns.builder.concrete.SinopodaScurionBuilder;
import com.designpatterns.builder.director.God;
import com.designpatterns.builder.product.base.Creature;

public class BuilderPatternRunner implements PatternExampleRunner{

	@Override
	public void runPattern() {
		
		var god = new God();
		var homoSapiensBuilder = new HomoSapiensBuilder();
		var sinopodaScurionBuilder = new SinopodaScurionBuilder();
		
		var homoSapiens = god.createHomoSapiens(homoSapiensBuilder);
		var strangeSpider = god.createSinopodaScurion(sinopodaScurionBuilder);
		
		printInfo(homoSapiens);
		printInfo(strangeSpider);
		
	}

	private void printInfo(Creature creature) {
		System.out.println("\nHi there! I am a " + creature.getClass().getSimpleName() 
				+ "." + "\nI was created by the allknown director. \nI have:" 
				+ creature.toString() + "\n\n");
		
	}

}

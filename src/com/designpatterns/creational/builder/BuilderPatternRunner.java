package com.designpatterns.creational.builder;

import com.designpatterns.PatternExampleRunner;
import com.designpatterns.creational.builder.concrete.HomoSapiensBuilder;
import com.designpatterns.creational.builder.concrete.SinopodaScurionBuilder;
import com.designpatterns.creational.builder.director.God;
import com.designpatterns.creational.builder.product.base.Creature;

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

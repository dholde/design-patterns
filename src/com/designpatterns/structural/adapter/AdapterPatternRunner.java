package com.designpatterns.structural.adapter;

import com.designpatterns.PatternExampleRunner;

public class AdapterPatternRunner implements PatternExampleRunner {

	@Override
	public void runPattern() {

		SuperHero superMan = new SuperHero();
		superMan.setName("Super Man");
		superMan.setRealName("Klark Kent");
		superMan.setWeakness("Krytonite");
		superMan.setSuperHeroUniverse("DC");
		
		SuperHeroXmlDataFeedProducer xmlFeedProducer = new SuperHeroXmlDataFeedProducer();
		xmlFeedProducer.setSuperHero(superMan);
		System.out.println(xmlFeedProducer.getSuperHeroDataAsXmlString());
		
	}

}

package com.designpatterns.structural.adapter;

import com.designpatterns.PatternExampleRunner;

public class AdapterPatternRunner implements PatternExampleRunner {

	@Override
	public void runPattern() {

		SuperHero superMan = new SuperHero();
		superMan.setName("Super Man");
		superMan.setRealName("Klark Kent");
		superMan.setSuperPower("Heat Vision");
		superMan.setWeakness("Krytonite");
		superMan.setSuperHeroUniverse("DC");
		
		SuperHeroXmlDataFeedProducer superHeroXmlFeedProducer = new SuperHeroXmlDataFeedProducer(superMan);
		System.out.println(superHeroXmlFeedProducer.getSuperHeroDataAsXmlString());
		
		SuperHeroXmlToJsonFeedAdapter superHeroXmlToJsonFeedAdapter = new SuperHeroXmlToJsonFeedAdapter(superHeroXmlFeedProducer);
		System.out.println(superHeroXmlToJsonFeedAdapter.getSuperHeroDataAsJsonString());
		
		
		
	}

}

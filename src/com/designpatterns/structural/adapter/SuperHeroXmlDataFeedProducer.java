package com.designpatterns.structural.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class SuperHeroXmlDataFeedProducer {
	
	private SuperHero superHero;
	
	public String getSuperHeroDataAsXmlString() {
		String heroAsString = "<SuperHero>Unfortunately there is no hero data</SuperHero>";
		ObjectMapper xmlMapper = new XmlMapper(); 
		try {
			heroAsString = xmlMapper.writeValueAsString(this.superHero);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return heroAsString;
	}
	
	public String getSuperHeroFeed() {
		return this.getSuperHeroDataAsXmlString();
	}

	public SuperHero getSuperHero() {
		return superHero;
	}

	public void setSuperHero(SuperHero superHero) {
		this.superHero = superHero;
	}
	
}

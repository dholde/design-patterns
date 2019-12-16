package com.designpatterns.structural.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class SuperHeroXmlToJsonFeedAdapter implements SuperHeroFeedConsumer {
	
	private SuperHeroXmlDataFeedProducer superHeroXmlFeedProducer;
	
	private SuperHeroXmlToJsonFeedAdapter(SuperHeroXmlDataFeedProducer superHeroXmlFeedProducer) {
		this.setSuperHeroXmlFeedProducer(superHeroXmlFeedProducer);
	}

	@Override
	public String printSuperHeroInfosFromJsonFeed() {
		String xmlFeed = superHeroXmlFeedProducer.getSuperHeroFeed();
		String jsonFeed = "";
		XmlMapper xmlMapper = new XmlMapper();
		try {
			SuperHero superHero = xmlMapper.readValue(xmlFeed, SuperHero.class);
			ObjectMapper objectMapper = new ObjectMapper();
			jsonFeed = objectMapper.writeValueAsString(superHero);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonFeed;
	}

	public SuperHeroXmlDataFeedProducer getSuperHeroXmlFeedProducer() {
		return superHeroXmlFeedProducer;
	}

	public void setSuperHeroXmlFeedProducer(SuperHeroXmlDataFeedProducer superHeroXmlFeedProducer) {
		this.superHeroXmlFeedProducer = superHeroXmlFeedProducer;
	}
}

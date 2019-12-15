package com.designpatterns.structural.adapter;

public class SuperHero {
	
	private String realName;
	private String name;
	private String superPower;
	private String weakness;
	private String superHeroUniverse;
	
	
	public SuperHero() {
		
	}
	
	public SuperHero(String realName, String name, String superPower,String weakness, String superHeroUniverse) {
		super();
		this.realName = realName;
		this.name = name;
		this.superPower = superPower;
		this.weakness = weakness;
		this.superHeroUniverse = superHeroUniverse;
	}
	
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuperPower() {
		return superPower;
	}
	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}
	public String getWeakness() {
		return weakness;
	}
	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}
	public String getSuperHeroUniverse() {
		return superHeroUniverse;
	}
	public void setSuperHeroUniverse(String superHeroUniverse) {
		this.superHeroUniverse = superHeroUniverse;
	}

}

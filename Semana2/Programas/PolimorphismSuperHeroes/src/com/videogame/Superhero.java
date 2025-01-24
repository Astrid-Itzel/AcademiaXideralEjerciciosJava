package com.videogame;

//abstract para que no puedan crearse o instancias u objetos
public abstract class Superhero {

	private String name;
	private String superpower;
	private String weakness;
	private int velocity;	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuperpower() {
		return superpower;
	}

	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	//constructor
	public Superhero (String name, String superpower, String weakness, int velocity) {
		
		this.name = name;
		this.superpower = superpower;
		this.weakness = weakness;
		this.velocity = velocity;
	}
	
	//método abstract
	public void useSuperpower () {
		
	}
	
}

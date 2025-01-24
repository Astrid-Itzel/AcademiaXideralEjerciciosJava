package com.videogame;

public class Superman extends Superhero{

	
	
	public Superman(String name, String superpower, String weakness, int velocity) {
		super(name, superpower, weakness, velocity);
	}
	
	@Override
	public void useSuperpower () {
		System.out.println("Usa visión láser");
	}
	
	public void volar(){
		System.out.println("Volar");
	}
	
}
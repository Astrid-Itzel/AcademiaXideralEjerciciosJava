package com.videogame;

public class WonderWoman extends Superhero{
	
	
	public WonderWoman(String name, String superpower, String weakness, int velocity) {
		super(name, superpower, weakness, velocity);
	}

	@Override
	public void useSuperpower () {
		System.out.println("Usa el lazo de la Verdad");
	}
	
	
	
}



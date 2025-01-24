package com.videogame.immutable.objects;

//1. Declaramos la clase como final para impedir que sea heredada
public final class Superman extends Superhero{

	
	
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
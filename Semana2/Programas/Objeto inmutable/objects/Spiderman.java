package com.videogame.immutable.objects;

//1. Declaramos la clase como final para impedir que sea heredada
 public final class Spiderman extends Superhero{

	
	public Spiderman(String name, String superpower, String weakness, int velocity) {
		super(name, superpower, weakness, velocity);
	}

	@Override
	final public void useSuperpower () {
		System.out.println("Usa el sentido arácnido.");
	}
	
}

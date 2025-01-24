package com.videogame.immutable.objects.V1;

//1. Declaramos la clase como final para impedir que sea heredada
 public final class Spiderman extends Superhero{

	
	public Spiderman(StringBuilder string, String superpower, String weakness, int velocity) {
		super(string, superpower, weakness, velocity);
	}

	@Override
	final public void useSuperpower () {
		System.out.println("Usa el sentido arácnido.");
	}
	
}

package com.videogame.immutable.objects.V1;

//1. Declaramos la clase como final para impedir que sea heredada
public final class WonderWoman extends Superhero{
	
	
	public WonderWoman(StringBuilder name, String superpower, String weakness, int velocity) {
		super(name, superpower, weakness, velocity);
	}

	@Override
	public void useSuperpower () {
		System.out.println("Usa el lazo de la Verdad");
	}
	
	
	
}



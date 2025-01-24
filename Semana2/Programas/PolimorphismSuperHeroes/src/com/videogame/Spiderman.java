package com.videogame;

public class Spiderman extends Superhero{

	
	public Spiderman(String name, String superpower, String weakness, int velocity) {
		super(name, superpower, weakness, velocity);
	}

	@Override
	public void useSuperpower () {
		System.out.println("Usa el sentido arácnido.");
	}
	
}

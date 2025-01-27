package com.videogame.immutable.objects.V1;

//abstract para que no puedan crearse o instancias u objetos

public abstract class Superhero {

	//2. Establecemos que las propiedades (fields) sean private para no tener acceso de forma directa
	
	//4.  Establecemos que las propiedades (fields) sean final 
	private final StringBuilder name;
	private final String superpower;
	private final String weakness;
	private final int velocity;	
	
	//Constructor
	public Superhero(StringBuilder name, String superpower, String weakness, int velocity) {
		//El super() es porque a su vez, hereda de object
		super();
		
	//En el caso de propiedades (fields) mutables, creamos una deep copy para que se apunte a un objeto nuevo y el real no sea modificado
		this.name = new StringBuilder(name);
		this.superpower = superpower;
		this.weakness = weakness;
		this.velocity = velocity;
		/*
		this.name = name;
		this.superpower = superpower;
		this.weakness = weakness;
		this.velocity = velocity;
	*/
	}

	//3. No proveemos setters
	public StringBuilder getName() {
		//Hacemos un clon del objeto mutables en los getters para regresar una copia, en lugar del objeto de referencia real 
		return new StringBuilder(name);
	}

	/*public void setName(String name) {
		this.name = name;
	}*/

	public String getSuperpower() {
		return superpower;
	}

	/*public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}*/

	public String getWeakness() {
		return weakness;
	}

	/*public void setWeakness(String weakness) {
		this.weakness = weakness;
	}*/

	public int getVelocity() {
		return velocity;
	}

	/*public void setVelocity(int velocity) {
		this.velocity = velocity;
	}*/

	
	//método abstract
	public void useSuperpower () {
		
	}
	
}

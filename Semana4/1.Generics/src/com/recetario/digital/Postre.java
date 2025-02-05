package com.recetario.digital;

public class Postre implements Platillo{


	//HAS-A
	private String nombre;
	private Dificultad dificultad; //enum
	private StringBuilder receta;
	
	//Constructor
	public Postre(String nombre, Dificultad dificultad, StringBuilder receta) {
		super();
		this.nombre = nombre;
		this.dificultad = dificultad;
		this.receta = receta;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Dificultad getDificultad() {
		return dificultad;
	}


	public void setDificultad(Dificultad dificultad) {
		this.dificultad = dificultad;
	}


	public StringBuilder getReceta() {
		return receta;
	}


	public void setReceta(StringBuilder receta) {
		this.receta = receta;
	}

	//toString
	@Override
	public String toString() {
		return "Postre [nombre=" + nombre + ", dificultad=" + dificultad + ", receta=" + receta + "]";
	}
	
	
}

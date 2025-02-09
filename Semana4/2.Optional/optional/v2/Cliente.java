package com.optional.v2;

public class Cliente {

	private String name;
	private int edad;
	private String pais;
	
	
	public Cliente(String name, int edad, String pais) {
		super();
		this.name = name;
		this.edad = edad;
		this.pais = pais;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}




}

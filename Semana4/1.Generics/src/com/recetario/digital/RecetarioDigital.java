package com.recetario.digital;

//Establezco un generic de tipo para que la clase RecetarioDigital 
public class RecetarioDigital <T extends Platillo> { //generic de subtipo Platillo

	//HAS-A
	T t;

	//Constructor
	public RecetarioDigital(T t) {
		super();
		this.t = t;
	}

	//Getters y Setters
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	//método con generics para imprimir cualquier clase que implements Platillo
	public <E> void mostrarReceta (E e) {
	System.out.println(t);
	}
	
}

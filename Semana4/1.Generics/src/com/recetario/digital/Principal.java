package com.recetario.digital;

public class Principal {

	public static void main(String[] args) {
		
		Postre postre1 = new Postre ("Flan", Dificultad.MEDIA, new StringBuilder(""));
		Entrada entrada1 = new Entrada ("Sopa", Dificultad.BAJA, new StringBuilder(""));
		PlatilloPrincipal platilloPrincipal1 = new PlatilloPrincipal ("Ratatouille", Dificultad.BAJA, new StringBuilder(""));
		
		//como las clases Postre, Entrada y PlatilloPrincipal implements Platillo, podemos usar ese generic
		RecetarioDigital<Platillo> recetario1 = new RecetarioDigital<>(postre1);
		RecetarioDigital<Platillo> recetario2 = new RecetarioDigital<>(entrada1);
		RecetarioDigital<Platillo> recetario3 = new RecetarioDigital<>(platilloPrincipal1);
		
		recetario1.mostrarReceta(postre1);
		recetario2.mostrarReceta(entrada1);
		recetario3.mostrarReceta(platilloPrincipal1);

		
		
	}//main

}//Principal

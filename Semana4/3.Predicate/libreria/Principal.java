package com.libreria;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		List<Libro> listaLibros = new ArrayList<>();
	            listaLibros.add(new Libro("El Quijote", "Miguel de Cervantes", "978-84-376-0494-7", 10));
	            listaLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", "978-84-376-0495-4", 15));
	            listaLibros.add(new Libro("1984", "George Orwell", "978-84-376-0496-1", 20));
	            listaLibros.add(new Libro("Moby Dick", "Herman Melville", "978-84-376-0497-8", 8));
	            listaLibros.add(new Libro("Orgullo y prejuicio", "Jane Austen", "978-84-376-0498-5", 12));
	            listaLibros.add(new Libro("Crimen y castigo", "Fiódor Dostoievski", "978-84-376-0499-2", 5));
	            listaLibros.add(new Libro("La Odisea", "Homero", "978-84-376-0500-5", 18));
	            listaLibros.add(new Libro("Fahrenheit 451", "Ray Bradbury", "978-84-376-0501-2", 7));
	            listaLibros.add(new Libro("Don Juan Tenorio", "José Zorrilla", "978-84-376-0502-9", 9));
	            listaLibros.add(new Libro("El Principito", "Antoine de Saint-Exupéry", "978-84-376-0503-6", 25));
	        
	            
	            Predicate<Libro> pred1 = libro -> libro.getStock() >= 10;
	            Predicate<Libro> pred2 = libro -> libro.getAutor().equals("Homero");
	            Predicate<Libro> pred3 = libro -> libro.getIsbn().endsWith("6");
	            
	            
	            
	            for(Libro libro: listaLibros) {
	            	if(pred1.test(libro)) {
	            		System.out.println(libro);
	            	}
	            }
	            
	}//main

}//Principal

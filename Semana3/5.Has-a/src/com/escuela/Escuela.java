package com.escuela;

import java.util.*;

public class Escuela {

	//HAS-A
	private String nombre;
	private List<Estudiante> listaEstudiantes; 
	private List<Docente> listaDocentes;
	
	
	
	//Constructor
	public Escuela(String nombre, List<Estudiante> listaEstudiantes) {
		super();
		this.nombre = nombre;
		this.listaEstudiantes = listaEstudiantes;
		//Se inicializa una lista vacía de docentes
		listaDocentes = new ArrayList <> ();
		
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public List<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}



	public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}



	public List<Docente> getListaDocentes() {
		return listaDocentes;
	}


	//Retiramos el setter de la listaDocentes para lograr composición
	
	/*public void setListaDocentes(List<Docente> listaDocentes) {
		this.listaDocentes = listaDocentes;
	} */

	
	//Método para agregar docentes a listaDocentes
	
	public void setDocente (Docente docente) {
		listaDocentes.add(docente);
	}
	
}

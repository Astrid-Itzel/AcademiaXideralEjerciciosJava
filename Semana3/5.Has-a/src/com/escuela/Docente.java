package com.escuela;

import java.time.*;

public class Docente {

	//HAS-A
	private String nombre;
	private String asignatura;
	private LocalDate fechaInicioTrabajo;
	
	
	//Constructor
	public Docente(String nombre, String asignatura, int anio, int mes, int dia) {
		super();
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.fechaInicioTrabajo = LocalDate.of(anio, mes, dia);
	}
	
	
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getAsignatura() {
		return asignatura;
	}




	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}




	public LocalDate getFechaInicioTrabajo() {
		return fechaInicioTrabajo;
	}




	public void setFechaInicioTrabajo(LocalDate fechaInicioTrabajo) {
		this.fechaInicioTrabajo = fechaInicioTrabajo;
	}




	// Método para calcular los años trabajados por el docente
    public int getAniosTrabajados() {
        return Period.between(fechaInicioTrabajo, LocalDate.now()).getYears();
    }

    //toString
	@Override
	public String toString() {
		return "Docente [nombre=" + nombre + ", Asignatura=" + asignatura + ", Años trabajados=" + getAniosTrabajados() 
				+ "]";
	}
    
    
}

package com.escuela;

import java.util.Objects;

public class Estudiante {
	
	//HAS-A
	private String nombre;
	private String apellido;
	private GradoEscolar grado;
	private Tutor tutor;
	
	//constructor
	public Estudiante(String nombre, String apellido, GradoEscolar grado, Tutor tutor) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.grado = grado;
		this.tutor = tutor;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public GradoEscolar getGrado() {
		return grado;
	}

	public void setGrado(GradoEscolar grado) {
		this.grado = grado;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	
	//hashCode() & equals() a partir del grado escolar
	@Override
	public int hashCode() {
		return Objects.hash(grado);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getNombre() != ((Estudiante) obj).getNombre())
			return false;
		Estudiante other = (Estudiante) obj;
		return grado == other.grado;
	} 
	
	
	//toString
		@Override
		public String toString() {
			return "[Estudiante : nombre=" + nombre + ", apellido=" + apellido + ", grado=" + grado + ", tutor:" + tutor.getNombre() +"]";
		}


	
	public void pagarColegiatura(double monto) {

		//delegar al tutor el pago
		tutor.realizarPago (monto, this.nombre, this.apellido);
		
		
	
	}
 	
}

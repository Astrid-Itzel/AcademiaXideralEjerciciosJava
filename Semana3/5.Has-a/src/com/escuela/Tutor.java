package com.escuela;

public class Tutor {
	
	//HAS-A	
	private String nombre;

	
	
	//Constructor
	public Tutor(String nombre) {
		super();
		this.nombre = nombre;
	}


	//Getters y Setters
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	@Override
	public String toString() {
		return "Tutor [nombre=" + nombre+" ]";
	}
	
	

	public boolean realizarPago(double cantidad, String nombreEstudiante, String apellidoEstudiante) {
		System.out.println("El tutor/a "+ nombre + " ha pagado la colegiatura del/de la estudiante " + nombreEstudiante +" "+ apellidoEstudiante);
		return true;
	}
	

}

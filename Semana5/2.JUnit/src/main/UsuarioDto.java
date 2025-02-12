package main;

import java.util.Objects;

public class UsuarioDto {

	//HAS-A
	private final Long id;
	private final String nombre;
	private final int edad;

	
	//Constructor
	public UsuarioDto(Long id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	//Getters y Setters
	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	
	//HashCode & equals
	@Override
	public int hashCode() {
		return Objects.hash(edad, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioDto other = (UsuarioDto) obj;
		return edad == other.edad && Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}
	
	//toString
	@Override
	public String toString() {
		return "UsuarioDto [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	} 
	
	
}

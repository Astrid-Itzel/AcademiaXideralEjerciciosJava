package com.javatechie.spring.batch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTES_INFO")

public class Cliente {

    @Id
    @Column(name = "CLIENTE_ID")
    private int id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "CORREO")
    private String correo;
    @Column(name = "GENERO")
    private String genero;
    @Column(name = "CONTACTO")
    private String numContacto;
    @Column(name = "PAIS")
    private String pais;
    @Column(name = "FECHA_NACIMIENTO")
    private String fechaNacimiento;
    
	public Cliente(int id, String nombre, String apellido, String correo, String genero, String numContacto,
			String pais, String fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.genero = genero;
		this.numContacto = numContacto;
		this.pais = pais;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Cliente() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getEmail() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNumContacto() {
		return numContacto;
	}

	public void setNumContacto(String numContacto) {
		this.numContacto = numContacto;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Correo=" + correo
				+ ", Género=" + genero + ", Numero de contacto=" + numContacto + ", País=" + pais + ", Fecha de Nacimiento=" + fechaNacimiento + "]";
	}
	

}

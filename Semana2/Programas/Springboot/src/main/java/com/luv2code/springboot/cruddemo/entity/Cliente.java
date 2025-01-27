package com.luv2code.springboot.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido_paterno")
    private String apellidoPaterno;

    @Column(name="correo")
    private String correoElectronico;


    // define constructors
    public Cliente() {

    }

    public Cliente (String nombre, String apellidoPaterno, String correoElectronico) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.correoElectronico = correoElectronico;
    }

    // define getter/setter

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

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    // define toString
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nombre ='" + nombre + '\'' +
                ", apellido_paterno='" + apellidoPaterno + '\'' +
                ", correo='" + correoElectronico + '\'' +
                '}';
    }
}









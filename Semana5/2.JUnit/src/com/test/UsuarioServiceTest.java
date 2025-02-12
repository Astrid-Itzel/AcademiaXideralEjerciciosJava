package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.UsuarioDto;
import main.UsuarioService;

class UsuarioServiceTest {

	//La anotacion @DisplayName ayuda a detallar el nombre de la prueba sin tener que crear un nombre largo para ésta
	@Test
	@DisplayName("Cuando llamamos a crearUsuario, esperamos que el usuario que ingresamos haya sido creado")
	void test1() {
	
	UsuarioDto usuarioEsperado = new UsuarioDto(1L,"Juan Ramón Gonzalez", 18);
		
	//Comenzamos creando la clase UsuarioService para testearla
	UsuarioService usuarioService = new UsuarioService();
	
	//llamamos al método crearUsuario de la instancia
	final UsuarioDto usuarioCreado = usuarioService.crearUsuario(1L, "Juan Ramón Gonzalez", 18);
	
	//Comparamos si el usuarioEsperado es igual al usuarioCreado
		Assertions.assertEquals(usuarioEsperado, usuarioCreado);
	
	//Las clases serán iguales debido a que se sobreescribió el equals
	
	}
	
	
	@Test
	@DisplayName("Cuando llamamos a crearUsuario, esperamos que la edad del usuario que ingresamos sea igual")
	void test2() {
	
	UsuarioDto usuarioEsperado = new UsuarioDto(8L,"Carlos Sosa", 18);
		
	//Comenzamos creando la clase UsuarioService para testearla
	UsuarioService usuarioService = new UsuarioService();
	
	//llamamos al método crearUsuario de la instancia
	final UsuarioDto usuarioCreado = usuarioService.crearUsuario(1L, "Juan Ramón Gonzalez", 18);
	
	//Comparamos por edad, si la edad del usuarioEsperado es igual a la del usuarioCreado 
	// Si la edad coincide, aunque las demás propiedades no lo hagan, dará true.
	Assertions.assertEquals(usuarioEsperado.getEdad(), usuarioCreado.getEdad(), "La edad es diferente");
		
	}
	
	@Test
	@DisplayName("Cuando llamamos a crearUsuario, esperamos que el nombre del usuario que ingresamos sea igual")
	void test3() {
	
	UsuarioDto usuarioEsperado = new UsuarioDto(1L,"Juan Ramón Gonzalez", 18);
		
	//Comenzamos creando la clase UsuarioService para testearla
	UsuarioService usuarioService = new UsuarioService();
	
	//llamamos al método crearUsuario de la instancia
	final UsuarioDto usuarioCreado = usuarioService.crearUsuario(6L, "Juan Ramón Gonzalez", 48);
	
	//Comparamos por nombre si el usuarioEsperado es igual al usuarioCreado y dejamos un mensaje en caso de tener nombres diferentess
	// Si el nombre coincide aunque las demás propiedades no lo hagan, dará true.
		Assertions.assertEquals(usuarioEsperado.getNombre(), usuarioCreado.getNombre(), "El nombre no es el mismo");
		
	}

	@Test
	@DisplayName("Cuando llamamos a crearUsuario, esperamos que la edad del usuario que ingresamos sea diferente")

	void test4() {
	
	UsuarioDto usuarioEsperado = new UsuarioDto(1L,"Carlos Sosa", 18);
		
	//Comenzamos creando la clase UsuarioService para testearla
	UsuarioService usuarioService = new UsuarioService();
	
	//llamamos al método crearUsuario de la instancia
	final UsuarioDto usuarioCreado = usuarioService.crearUsuario(1L, "Juan Ramón Gonzalez", 18);
	
	//Comparamos por nombre, si el usuarioEsperado es diferente al usuarioCreado dará true
	// Si el nombre No coincide aunque las demás propiedades sí lo hagan, dará true.
		Assertions.assertNotEquals(usuarioEsperado.getNombre(), usuarioCreado.getNombre());
		
	}

	
    @Test
    @DisplayName("Cuando llamamos a obtenerUsuario con un ID inexistente, esperamos que retorne null")
    void test5() {
        UsuarioService usuarioService = new UsuarioService();
        final UsuarioDto usuarioCreado = usuarioService.obtenerUsuario(10L);
        Assertions.assertNull(usuarioCreado, "El usuario no debería existir");
    }

    
    @Test
    @DisplayName("Cuando creamos usuario y llamamos a obtenerUsuario con un ID, esperamos que retorne al usuario creado")
    void test6() {
    	
    	UsuarioDto usuarioEsperado2 = new UsuarioDto (4L, "Ariel Espinoza", 29);
    			
        UsuarioService usuarioService = new UsuarioService();
        
        usuarioService.crearUsuario (4L, "Ariel Espinoza", 29);
        
        final UsuarioDto usuarioCreado = usuarioService.obtenerUsuario(4L);
		Assertions.assertEquals(usuarioEsperado2, usuarioCreado);
    }
}

package com.archivo;

public class CarpetaDeArchivos implements AutoCloseable{

	public void open() throws ContraseñaIncorrectaException { 
		
		System.out.println("Carpeta abierta");	
		}
	

	@Override
	public void close() throws Exception {
		System.out.println("Carpeta cerrada");	

	}
}

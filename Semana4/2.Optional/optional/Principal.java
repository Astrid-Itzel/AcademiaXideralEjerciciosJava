package com.optional;

import java.util.Optional;

public class Principal {

	public static void  main(String[] args) {
		//emptyOptional();
		//nullEnOptional();
		orElseOptional();
	}
	
	public static void emptyOptional() {
		Optional<String> empty = Optional.empty();
		boolean b = empty.isPresent();
		System.out.println(empty);
		System.out.println(b);
	}
	// Si no usaramos Optional, se lanzaría NullPointerException

	
	//No es posible meter un null en un Optional porque lanzaría una exception
	public static void nullEnOptional() {
		String name = null;
		//Optional.of(name); 
		//Aquí, lanzaría una excpetion, pero podemos cacharla con try-catch
		try {
			Optional.of(name); 
		}catch(NullPointerException e) {
			System.out.println(e);
		}}
		
	public static void nullEnOptionalConNullable() {
			String name = null;
			//.ofNullable protege de la exception, aquí no imprimiría nada
			Optional.ofNullable(name); 
				System.out.println(name);
	}
				
	public static void orElseOptional() {
		String name = null;
		//.ofNullable protege de la exception, aquí no imprimiría nada
		String name2 = Optional.ofNullable(name)
				.orElse("Juan");
			System.out.println(name2);	
	}
			
		{System.out.println("Fin del programa");
		
	}
}
	


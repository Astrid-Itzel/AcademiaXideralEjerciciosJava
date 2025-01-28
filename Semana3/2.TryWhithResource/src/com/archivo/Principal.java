package com.archivo;

import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) throws Exception {
		 try (CarpetaDeArchivos carpeta = new CarpetaDeArchivos();
				 Scanner scanner = new Scanner(System.in)
				 ) {
	        
			String contraseña = "pa$$word";
			  
			System.out.println("Ingresa la contraseña:");
						
			if (contraseña.equals(scanner.nextLine())) {   
			 carpeta.open(); 
			} else {
				throw new ContraseñaIncorrectaException("La contraseña es inválida");
			}   
			
		} catch (ContraseñaIncorrectaException e) {
			System.out.println("Entrada denegada: " + e.getMessage());	
			e.printStackTrace();  
	        }
	}

}

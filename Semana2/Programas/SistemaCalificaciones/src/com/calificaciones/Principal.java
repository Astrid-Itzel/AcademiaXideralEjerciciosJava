package com.calificaciones;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

	private static final boolean String = false;

	public static void main(String[] args) {

		//creo una lista de alumnos
		ArrayList <Estudiante> listaAlumnos = new ArrayList<>();
		
		//instancio la lista de estudiantes
		listaAlumnos.add(new Estudiante("Pedro",0.0,0.0,0.0,0.0,0.0));
		listaAlumnos.add(new Estudiante("Maria",0.0,0.0,0.0,0.0,0.0));
		listaAlumnos.add(new Estudiante("Lourdes",0.0,0.0,0.0,0.0,0.0));
		listaAlumnos.add(new Estudiante("Marcos",0.0,0.0,0.0,0.0,0.0));
		listaAlumnos.add(new Estudiante("Alondra",0.0,0.0,0.0,0.0,0.0));
		listaAlumnos.add(new Estudiante("Anahi",0.0,0.0,0.0,0.0,0.0));
		listaAlumnos.add(new Estudiante("Juan",0.0,0.0,0.0,0.0,0.0));
		listaAlumnos.add(new Estudiante("Pablo",0.0,0.0,0.0,0.0,0.0));
		
		
		//Imprimir lista de todos los estudiantes
		/*for (Estudiante estudiante : listaAlumnos) {
		System.out.println("Nombre: " + estudiante.getName() 
			+ ", Grupo: " + Estudiante.getGroup() 
			+ ", Matemáticas: " + estudiante.getScoreMaths()
			+ ", Geografía: " + estudiante.getScoreGeography()
			+ ", Español: " + estudiante.getScoreSpanish()
			+ ", Informática: " + estudiante.getScoreIT()
			+ ", Educación Físca" + estudiante.getScorePE()				
				);
		}*/
		
		//inicializo scanner
		Scanner scanner = new Scanner (System.in);
		
		//solicito al usuario nombre de estudiante a buscar
		System.out.println("Ingresa el nombre de estudiante:");
		String nombreAlumno = scanner.nextLine();
		
		 boolean encontrado = false;
		 
		 //declaración de array en caso de que el usuari quiera establecer todas las calificaciones a la vez
		 double[] calificaciones = new double[5];

		
		for (Estudiante estudiante : listaAlumnos) {
			if (estudiante.getName().equalsIgnoreCase(nombreAlumno)) {
				
				//si el nombre del estudiante ingresado es encontrado
				System.out.println("Estudiante hallado, ¿Quieres introducir calificaciones? Oprime 1 (sí), o 2(no)");
				 encontrado = true;
				 boolean formularioCompletado = false;
				 String respuesta = scanner.nextLine();
				 
				 //si el usuario desea asignar calificaciones
				if(respuesta.equals("1")) {
					
					System.out.println("¿Deseas ingresar una por una (oprime 1) o todas a la vez (oprime 2)?");
					 String respuesta2 = scanner.nextLine();
					 
					if(respuesta2.equals("1")) {
					
					//Matemáticas
					System.out.println("Introduce calificación de Matemáticas:");
					//lee calificacions del scanner y aplica el método revisarCalificacion para comprobar dato válido
					double scoreMaths = revisarCalificacion(scanner);
					//se asigna valor a la propiedad 
					estudiante.setScoreMaths(scoreMaths);
					
					//Geografía
					System.out.println("Introduce calificación de Geografía:");
					//lee calificacions del scanner y aplica el método revisarCalificacion para comprobar dato válido
					double scoreGeography = revisarCalificacion(scanner);
					//se asigna valor a la propiedad 
					estudiante.setScoreGeography(scoreGeography);
					
					//Español
					System.out.println("Introduce calificación de Español:");
					//lee calificacions del scanner y aplica el método revisarCalificacion para comprobar dato válido
					double scoreSpanish = revisarCalificacion(scanner);
					//se asigna valor a la propiedad 
					estudiante.setScoreSpanish(scoreSpanish);
					
					//Informática
					System.out.println("Introduce calificación de Informática:");
					//lee calificacions del scanner y aplica el método revisarCalificacion para comprobar dato válido
					double scoreIT = revisarCalificacion(scanner);
					//se asigna valor a la propiedad 
					estudiante.setScoreIT(scoreIT);
					
					//Educación Física
					System.out.println("Introduce calificación de Educación física:");
					//lee calificacions del scanner y aplica el método revisarCalificacion para comprobar dato válido
					double scorePE = revisarCalificacion(scanner);
					//se asigna valor a la propiedad 
					estudiante.setScorePE(scorePE);
										
					
					//al completar todos los campos
					formularioCompletado = true;
                    
					}else if (respuesta2.equals("2")) {
						
						System.out.println("Por favor introduce las 5 calificaciones separadas por un espacio en el siguiente orden: Matemàticas, Geografìa, Español, Informàtica y Educación física.");
						String califIntroducidas = scanner.nextLine();
						
						
				        double[] calificacionesArray = new double[5]; // Suponemos que siempre se ingresan 5 calificaciones

				        // Llamamos al método para validar las calificaciones
				        revisarCalificacion(scanner, calificacionesArray);
				        
				        formularioCompletado = true;
					}
					//si todos los campos fueron completados, imprime:
					if (formularioCompletado == true) {
					// Imprimir el estudiante actualizado
                    System.out.println("Estudiante actualizado:");
                    System.out.println(estudiante.getName());
                    System.out.println("Matemáticas: " + estudiante.getScoreMaths());
                    System.out.println("Geografía: " + estudiante.getScoreGeography());
                    System.out.println("Español: " + estudiante.getScoreSpanish());
                    System.out.println("Informàtica: " + estudiante.getScoreIT());
                    System.out.println("Educación Física: " + estudiante.getScorePE());
					
					}
				}	 
						//si el usuario no desea asignar calificaciones
						else if(respuesta.equals("2")){
							System.out.println("Fin del programa");
							break;
						}
				 else {}
			break;
			}
			} 
		if (!encontrado) {
			System.out.println("Estudiante sin registro.");
		}
		
	}//cierre main
	
	
		//método para berificar si la calificación es válida
		public static double revisarCalificacion (Scanner scanner) {
			double calificacion = -1; //valor fuera de rango para poder inicializar
			
			//continua el ciclo mientras calificacion no tenga un valor correcto
			while (calificacion < 0 || calificacion > 10) {
				try {
					
				//Double.parseDouble transforma de String recibido a double
		            calificacion = Double.parseDouble(scanner.nextLine());
		            
	                if (calificacion < 0 || calificacion > 10) {
		            System.out.println("Calificacion inválida. Ingresa una calificación de 0 a 10:");
				
	                }
	                }catch(NumberFormatException exception){
	                System.out.println("Por favor ingresa un número válido.");

				}
				
		}
			
			return calificacion;
		}
		
		//OVERLOADING
		//método que recibe y verifica conjunto de calificaciones, recibe un array
		public static void revisarCalificacion(Scanner scanner, double[] calificaciones) {
			
			//separamos las calificaciones
			String[] partes = scanner.nextLine().split(" ");
			
			// Verificamos que se hayan ingresado exactamente 5 calificaciones
	        do{
			if (partes.length != 5) {
	            System.out.println("Por favor ingresa exactamente 5 calificaciones.");  
	        }}while (partes.length != 5);
			
			//iteramos sobre las calificaciones
			for (int i = 0; i < calificaciones.length; i++) {
				// Llamamos al método anterior para validar cada calificación
				try {
	                // Convertimos cada calificación a double
	                double calificacion = Double.parseDouble(partes[i]);

	                // Validamos que la calificación esté entre 0 y 10
	                if (calificacion < 0 || calificacion > 10) {
	                    System.out.println("La calificación " + (i + 1) + " es inválida. Debe estar entre 0 y 10.");
	                    return;
	                }else if(calificacion > 0 & calificacion < 10) {

	                // Asignamos la calificación al arreglo
	                calificaciones[i] = calificacion;
				}} catch (NumberFormatException e) {
	                System.out.println("La calificación " + (i + 1) + " no es un número válido. Por favor ingresa un número.");
	                return;
			}}
			
		}
		} //cierre Principal

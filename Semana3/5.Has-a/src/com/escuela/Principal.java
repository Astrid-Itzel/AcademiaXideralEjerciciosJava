package com.escuela;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		//Creamos la lista de estudiante y la instanciamos, la podemos crear aquí pues tiene una relación agregación, por lo que podríamos tener acceso y seguiría existiendo aún después de eliminar Escuela
		List<Estudiante> listaEstudiantes = new ArrayList<>();
		listaEstudiantes.add(new Estudiante("Juan", "González", GradoEscolar.PRIMERO, new Tutor("Martha Sánchez")));
		listaEstudiantes.add(new Estudiante("María", "Rodríguez", GradoEscolar.SEGUNDO, new Tutor("José Luis García")));
		listaEstudiantes.add(new Estudiante("Carlos", "López", GradoEscolar.TERCERO, new Tutor("Luisa Fernández")));
		listaEstudiantes.add(new Estudiante("Ana", "Martínez", GradoEscolar.CUARTO, new Tutor("Ricardo Pérez")));
		listaEstudiantes.add(new Estudiante("Luis", "Hernández", GradoEscolar.QUINTO, new Tutor("Patricia López")));
		listaEstudiantes.add(new Estudiante("Sofía", "Pérez", GradoEscolar.SEXTO, new Tutor("Francisco Gómez")));


		//Obtenemos lista completa de estudiantes:
		for (Estudiante estudiante : listaEstudiantes) {
		System.out.println(estudiante);
		}
		

		//Buscamos algún estudiante bajo la variable estudianteBuscado
		Estudiante estudianteBuscado = encontrarEstudiante(listaEstudiantes, "carlos");

		//Hacemos que algún estudiante pague la colegiatura usando delegación hacia el tutor:
		if (estudianteBuscado!=null) {
			System.out.println(estudianteBuscado);
			estudianteBuscado.pagarColegiatura(1490.99);
		
	}
		
		//Creamos una escuela. La escuela has-a nombre y la listaEstudiantes
		Escuela escuela = new Escuela("Juana Pavón", listaEstudiantes);	
	

		//Instanciamos la listaDocentes que nació vacia en el constructor de Escuela, para tener una relación por composición. En este caso, si eliminamos la Escuela, la lista de Docentes también se eliminará.
		escuela.setDocente(new Docente("José Ramón Benitez Figueroa", "Matemáticas", 2015, 7, 23));
		escuela.setDocente(new Docente("María Guadalupe Martínez", "Ciencias", 2017, 3, 15));
		escuela.setDocente(new Docente("Carlos Eduardo Pérez", "Historia", 2018, 5, 10));
		escuela.setDocente(new Docente("Ana Laura González", "Lengua y Literatura", 2016, 8, 22));
		escuela.setDocente(new Docente("Luis Miguel Rodríguez", "Geografía", 2019, 2, 5));
		escuela.setDocente(new Docente("Patricia Ramírez Soto", "Inglés", 2014, 11, 18));
		escuela.setDocente(new Docente("José Luis Herrera", "Artes", 2020, 6, 30));
		escuela.setDocente(new Docente("Carmen Rosa Aguilar", "Música", 2021, 1, 12));
		escuela.setDocente(new Docente("Fernando Javier Torres", "Educación Física", 2016, 9, 7));


		//Prueba: NO SE TIENE ACCESO A LA LISTA DE DOCENTES listaDocentes
		/*for (Docente docente : listaDocentes) {
		System.out.println(docente);
		}*/
		
		
	}//cierre main
	
	//Método usando Iterator para encontrar estudiantes por nombre sin ser case sensitive
		private static Estudiante encontrarEstudiante(List<Estudiante> listaEstudiantes, String nombre){
			
			Iterator<Estudiante> iterator = listaEstudiantes.iterator();
			
			while(iterator.hasNext()) {
				Estudiante estudiante = iterator.next();
				if (nombre.equalsIgnoreCase(estudiante.getNombre()))
					return estudiante;
			}
			
			return null;
		}
	
}//Cierre Principal

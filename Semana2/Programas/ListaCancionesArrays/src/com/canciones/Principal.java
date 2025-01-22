package com.canciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Principal {

	public static void main(String[] args) {
		
		
		//Array playlist
		Cancion[] arrayPlaylist = new Cancion [10];
		
		//crear canciones
		Cancion cancion1 = new Cancion(1,"Soledad y el mar","Natalia Lafourcade","Balada",60);
		Cancion cancion2 = new Cancion(2,"La Llamada", "Café Tacvba", "Rock", 240);
		Cancion cancion3 = new Cancion(3,"Bésame Mucho", "Consuelo Velázquez", "Bolero", 200);
		Cancion cancion4 = new Cancion(4,"Despacito", "Luis Fonsi feat. Daddy Yankee", "Reguetón", 230);
		Cancion cancion5 = new Cancion(5,"Cielito Lindo", "Quirino Mendoza", "Ranchera", 180);
		Cancion cancion6 = new Cancion(6,"Vivir lo Nuestro", "Marc Anthony & La India", "Salsa", 210);
		Cancion cancion7 = new Cancion(7,"Bailando", "Enrique Iglesias", "Pop", 220);
		Cancion cancion8 = new Cancion(8,"La Cucaracha", "Tradicional Mexicana", "Folklore", 150);
		Cancion cancion9 = new Cancion(9,"Llamado de emergencia", "Daddy Yankee", "Reguetón", 200);
		Cancion cancion10 = new Cancion(10,"Oye Como Va", "Santana", "Salsa", 190);

		//agregar al array
		arrayPlaylist[0] = cancion1;
		arrayPlaylist[1] = cancion2;
		arrayPlaylist[2] = cancion3;
		arrayPlaylist[3] = cancion4;
		arrayPlaylist[4] = cancion5;
		arrayPlaylist[5] = cancion6;
		arrayPlaylist[6] = cancion7;
		arrayPlaylist[7] = cancion8;
		arrayPlaylist[8] = cancion9;
		arrayPlaylist[9] = cancion10;
				

		//Transformar el array a arrayList	
		List<Cancion> listPlaylist = new ArrayList<>(Arrays.asList(arrayPlaylist));
		
		//Agregar nuevas canciones
		Cancion cancion11 = new Cancion(11, "Baila", "Esteman", "Pop", 199);
		Cancion cancion12 = new Cancion(12, "Tu amor es mi piel", "Mon Laferte", "Balada", 240);

		
			listPlaylist.add(cancion11);
			listPlaylist.add(cancion12);

			
		//OPCIÓN A
		//imprimir array playlist
			//for (Cancion cancion : listPlaylist)
				//System.out.println(cancion.getNumberSong() + ", Nombre de la canción: " + cancion.getTitle() + ", Artista: " + cancion.getArtist() + ", Género: " + cancion.getGenre());
			
		//OPCIÓN B
		//imprimir array playlist
				//for (Cancion cancion : playlist)
				//System.out.println(cancion);
			
		//llamar al método para buscar canción	
	    buscarCanciones(listPlaylist);

						
	}
	
	//método para realizar la búsqueda de canción

	public static void buscarCanciones(List<Cancion> listPlaylist) {
		//Crea el Scanner
		Scanner scanner = new Scanner (System.in);
		
		//Solicita nombre de canción
		System.out.println("Ingresa el nombre de la canción que buscas: ");
		
		//recibir respuesta del usuario a trevés de scanner
		String busqueda = scanner.nextLine();
		
		//variable para determinar si fue encontrada o no y saber qué imprimir
		boolean encontrada = false;
		
		for (Cancion cancion : listPlaylist) {
			if (cancion.getTitle().equals(busqueda)) {
				System.out.println(cancion.getNumberSong() + 
						", Nombre de la canción: " + cancion.getTitle() + 
						", Artista: " + cancion.getArtist() + 
						", Género: " + cancion.getGenre());
				 encontrada = true;
			break;
			}
			} 
		if (!encontrada) {
			System.out.println("La canción no se tiene registrada.");
		}
		scanner.close();

		}
		
	}
	

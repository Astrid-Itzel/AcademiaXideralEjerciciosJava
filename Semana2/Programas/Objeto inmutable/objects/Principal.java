package com.videogame.immutable.objects;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		 // Crear instancia de Spiderman
		
        Superhero spiderman = new Spiderman("Spiderman", "Sentido Arácnido", "Electricidad", 100); 
        Superhero wonderWoman = new WonderWoman("Wonder Woman", "Lazo de la Verdad", "Magia", 90);
        Superhero superman = new Superman("Superman", "Visión láser", "Kryptonita", 200);

        //crear lista con superheroes
       /* List<Superhero> superheroesList = new ArrayList<>();
        
        //ingresar superheroes a la lista
        superheroesList.add(spiderman);
        superheroesList.add(wonderWoman);
        superheroesList.add(superman);*/
        
        //Inicializar scanner
        Scanner scanner = new Scanner(System.in); 
       
        
        System.out.println("Ingresa el id del Superheroe: \n(1) Spiderman\n(2) Wonder Woman\n(3) Superman");
        //Recibir respuesta en Scanner
        
        String response = scanner.nextLine(); 
        
        // Variable de tipo Superhero para almacenar el superhéroe seleccionado
        Superhero chosenHero = null;
        
        switch(response) {
        
        case "1":
        	chosenHero = spiderman;
            break;
        	
        case "2":
        	 chosenHero = wonderWoman;
             break;
        	
        case "3":
        	chosenHero = superman;
            break;
        default:
            System.out.println("Superheroe no encontrado.");
            break;
        } 
        
        
        
        //Imprime características del personaje elegido
        System.out.println("Superheroe: " + chosenHero.getName() + "\nSuperpoder: " + chosenHero.getSuperpower() + "\nDebilidad: " + chosenHero.getWeakness() + "\nVelocidad: " + chosenHero.getVelocity());
        
        //Sólo en caso de que la respuesta sea Superman (chosenHero apunte a Superman), ejecutamos el método volar, casteando la variable chosenHero que es de tipo Superhero a tipo Superman.
        if (chosenHero instanceof Superman) {
        ((Superman)chosenHero).volar();
        }
        
        
        // Método useSuperpower con polimorfismo
        chosenHero.useSuperpower();

    	scanner.close();        
	}


}

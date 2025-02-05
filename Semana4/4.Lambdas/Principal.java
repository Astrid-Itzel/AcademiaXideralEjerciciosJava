package juego.palabras;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Principal {

	public static void main(String[] args) {

		//Abrir scanner
		Scanner scanner = new Scanner(System.in);
		
		// Lambda Supplier. No damos nada como parámetro y nos regresa <T>. En este caso arroja un mensaje de bienvenida aleatorio.

        Supplier<String> mensajeBienvenida = () -> {
            String[] mensajes = {
                "¡Buena suerte en el juego!",
                "¡Prepárate para una aventura!",
                "¿Será pelíndromo?",
                "¡Que comience la diversión!"
            };
            
            
            Random random = new Random();
            return mensajes[random.nextInt(mensajes.length)];
        };

        // Mostrar mensaje de bienvenida aleatorio
        System.out.println(mensajeBienvenida.get());
		
		//Pedir al usuario una palabra
		System.out.println("Ingresa una palabra, te daremos sus detalles y verificaremos si es palíndromo.");
		String palabraSecreta = scanner.nextLine(); //scanner lee la palabra secreta ingresada
		
		
		
		// Lambda Consumer: pasamos un generic como parámetro, en este caso un String y no regresa nada, sólo lo imprime
		Consumer<String> consumerPalabraSecreta = s -> System.out.println("Palabra secreta: " + s);
		consumerPalabraSecreta.accept(palabraSecreta);
		
		// Lambda Function: Pasamos T y regresa R. En este caso, pasamos un String y nos regresa un Integer.
		Function<String, Integer> functionLongitud = s -> s.length();
		int longitud = functionLongitud.apply(palabraSecreta);
		System.out.println("Número de letras: " + longitud);
		
		// Le paso un generic T y me regresa T, En este caso, pasamos un String y nos regresa el Spring modificdo. Pasamos primero a StringBuilder para aplicar el método .reverse() y después regresa a ser String 
		UnaryOperator<String> uoInvertido = s -> new StringBuilder(s).reverse().toString();
		System.out.println("Palabra invertida: " + uoInvertido.apply(palabraSecreta));

		// Lambda Function: Pasamos T y regresa R. En este caso, pasamos un String y nos regresa un Integer.
		Function<String, Boolean> esPalindromo = s -> {
            return s.equalsIgnoreCase(uoInvertido.apply(s)); // Compara ignorando mayúsculas y minúsculas
        };
        System.out.println("¿Es palìndromo? " + esPalindromo.apply(palabraSecreta));
		
        scanner.close();
	}//main

	
}//Principal

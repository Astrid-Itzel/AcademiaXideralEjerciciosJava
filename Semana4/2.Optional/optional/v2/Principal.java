package com.optional.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Principal {

	public static void  main(String[] args) {
		
		Cliente cliente1 = new Cliente(null, 27, "México");
		Cliente cliente2 = new Cliente("Susana", 32, "Cuba");
		Cliente cliente3 = new Cliente("Martha", 34, "China");
		Cliente cliente4 = new Cliente("Marcos", 17, "México");

		List<Cliente> listaClientes = new ArrayList<>();
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		listaClientes.add(cliente3);
		listaClientes.add(cliente4);
		
		
        orElseOptional(cliente1); // Probamos el método con algún cliente
        orElseOptional(null); // Probamos el método con null y arroja "Sin nombre"

        
        System.out.println("Fin del programa");
	}
	

	public static void orElseOptional(Cliente cliente) {
		
		//.ofNullable protege de la exception
		String name2 = Optional.ofNullable(cliente.getName())
				.orElse("Sin información");// Si el nombre es null, usa "Sin nombre"
			System.out.println(name2);	
	}
}
	


package com.bank.accounts;

public class Principal {

	public static void main(String[] args) {
		
		// Usamos el inyector para obtener una instancia de Cliente con una cuenta asignada
        Client client = Inyector.getClient();

        // Registramos al cliente y abrimos su cuenta
        client.registerClient();
	}

}

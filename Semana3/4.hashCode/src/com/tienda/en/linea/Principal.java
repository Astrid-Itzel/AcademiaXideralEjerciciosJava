package com.tienda.en.linea;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Producto computadora = new Producto (ProductType.ELECTRONICS , "Computadora Lenovo", 8999.67);
		Producto barbie = new Producto (ProductType.TOYS , "Barbie Estrella de rock", 248.50);
		Producto celular = new Producto (ProductType.ELECTRONICS , "Celular Huawei Nova13", 10999.80);
		Producto chocolates  = new Producto (ProductType.FOOD , "Chocolates Lindor", 195.20);
		Producto chamarra = new Producto (ProductType.CLOTHES , "Chamarra Michael Kors", 5499.70);
		Producto libro = new Producto (ProductType.BOOKS , "Cien años de Soledad", 199.90);
		Producto muñeca = new Producto (ProductType.TOYS , "Barbie Estrella de rock", 248.50);
		Producto laptop = new Producto (ProductType.ELECTRONICS , "Computadora Lenovo", 8999.67);
		
		
		System.out.println(barbie.equals(muñeca)); //true
		
		//Creamos List de los productos
		List<Producto> listaDeProductos = List.of(computadora,barbie,celular,chocolates,chamarra, libro, muñeca, laptop);
		
		
		//Pasamos la List a un HashSet
		Set<Producto> setProductos = new HashSet<>(listaDeProductos);
		
		
		//Removemos productos
		//setProductos.remove(new Producto (ProductType.CLOTHES , "Chamarra Michael Kors", 5499.70));
		
		//Imprimimos el HashSet
		setProductos.forEach(producto -> System.out.println(producto));
		

	}

}

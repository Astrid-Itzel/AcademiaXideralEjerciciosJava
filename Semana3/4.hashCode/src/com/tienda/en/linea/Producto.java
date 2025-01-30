package com.tienda.en.linea;

import java.util.Objects;

public class Producto {

	//HAS-A
	private ProductType type;
	private String name;
	private double price;
	
	
	//Constructor
	public Producto(ProductType type, String name, double price) {
		super();
		this.type = type;
		this.name = name;
		this.price = price;
	}

	
	//Getters y Setters
	

	public ProductType getType() {
		return type;
	}


	public void setType(ProductType type) {
		this.type = type;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	
	//Override de equals() y hashCode()

	@Override
	public int hashCode() {
		return Objects.hash(type);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	//Override de toString para imprimir todas las propiedades
	@Override
	public String toString() {
		return "Producto [type=" + type + ", name=" + name + ", price=" + price + "]";
	}

	

	
	
	
	
	
}

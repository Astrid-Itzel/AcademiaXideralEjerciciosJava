package com.libreria;

public class Libro {

	
	//HAS-A
	private String titulo;
	private String autor;
	private String isbn;
	private int stock;

	//Constructor
	public Libro(String titulo, String autor, String isbn, int stock) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.stock = stock;
	}
	
	//Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", stock=" + stock + "]";
	}
	
	


}


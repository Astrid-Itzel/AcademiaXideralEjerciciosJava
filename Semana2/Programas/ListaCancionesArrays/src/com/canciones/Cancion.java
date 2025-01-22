package com.canciones;

public class Cancion {

	private int numberSong;
	private String title;
	private String artist;
	private String genre;
	private int duration;
	
	//constructor
	public Cancion (int numberSong, String title, String artist, String genre, int duration) {
		
		this.numberSong = numberSong;
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.duration = duration;
		
	}
	
	//getters and setters

	public int getNumberSong() {
		return numberSong;
	}

	public void setNumberSong(int numberSong) {
		this.numberSong = numberSong;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	//OPCIÓN B. @override de toString para que imprima las propiedades
	//@Override
	    //public String toString() {
	        //return  numberSong + ", Nombre de la canción: " + title + ", Artista: " + artist + ", Género: " + genre + ", Duración: " + duration + " segundos\n";
	    //}
}

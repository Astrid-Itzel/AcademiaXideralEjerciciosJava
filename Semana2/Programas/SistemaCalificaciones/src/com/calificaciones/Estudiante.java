package com.calificaciones;

public class Estudiante {

	//ATRIBUTOS
	private String name;
	//group es static pues será igual para todos los objetos creados, por lo que pertenece a la clase
	private static String group = "2A";
	//recibo calificaciones en wrapper Double
	private Double scoreMaths;
	private Double scoreGeography;
	private Double scoreSpanish;
	private Double scoreIT;
	private Double scorePE;
	
	//Constructor
	public Estudiante (String name, Double scoreMaths, Double scoreGeography, Double scoreSpanish, Double scoreIT, Double scorePE){
		this.name = name;
		this.scoreGeography = scoreGeography;
		this.scoreSpanish = scoreSpanish;
		this.scoreIT = scoreIT;
		this.scorePE = scorePE; 
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getGroup() {
		return group;
	}

	public static void setGroup(String group) {
		Estudiante.group = group;
	}

	public Double getScoreMaths() {
		return scoreMaths;
	}

	public void setScoreMaths(Double scoreMaths) {
		this.scoreMaths = scoreMaths;
	}

	public Double getScoreGeography() {
		return scoreGeography;
	}

	public void setScoreGeography(Double scoreGeography) {
		this.scoreGeography = scoreGeography;
	}

	public Double getScoreSpanish() {
		return scoreSpanish;
	}

	public void setScoreSpanish(Double scoreSpanish) {
		this.scoreSpanish = scoreSpanish;
	}

	public Double getScoreIT() {
		return scoreIT;
	}

	public void setScoreIT(Double scoreIT) {
		this.scoreIT = scoreIT;
	}

	public Double getScorePE() {
		return scorePE;
	}

	public void setScorePE(Double scorePE) {
		this.scorePE = scorePE;
	}
	
	
	
}

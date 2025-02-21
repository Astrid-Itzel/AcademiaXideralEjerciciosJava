package com.academy.proyecto.bo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data               // Genera automáticamente getters y setters. Incluye también toString(), equals() y hashCode().
@NoArgsConstructor  //Genera un constructor sin argumentos.
@AllArgsConstructor //Genera un constructor con todos los atributos como parámetros.
@Document("productToyStore")   //Indica que esta clase representa un documento en MongoDB.
								//La colección que se creará en la BD y en la que se almacenarán los datos será llamada "productToyStore".
public class ProductBean {
	private String productId;
	private String productName;
	private int stock;
	private Double price;
	private Integer descuento;
	private Double precioConDescuento;

}

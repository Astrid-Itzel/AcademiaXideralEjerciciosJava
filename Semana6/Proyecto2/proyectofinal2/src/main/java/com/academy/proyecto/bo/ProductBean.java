package com.academy.proyecto.bo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("productToyStore")
public class ProductBean {
	private String productId;
	private String productName;
	private int stock;
	private Double price;
	private Integer descuento;
}

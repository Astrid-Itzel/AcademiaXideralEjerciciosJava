package com.academy.proyecto.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductBean {
	private String productId;
	private String productName;
	private String price;
	private int stock;
	private String Department;
}

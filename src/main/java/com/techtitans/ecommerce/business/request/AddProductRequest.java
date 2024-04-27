package com.techtitans.ecommerce.business.request;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductRequest {
	
	private String title;
	private String description;
	private int quantity;
	private double price;
	private List<String> images;

}

package com.techtitans.ecommerce.business.responses;

import java.util.List;

import com.techtitans.ecommerce.entities.concretes.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductGetAllResponse {
	
	private Integer id;
	
	private String title;

	private String description;
	
	private double price;
	
	private double discountPercentage;
	
	private double rating;
	
	private Integer stock;
	
	private String brand;
	
	private String thumbnail;
	
	private String sellerName;
	
	private String sellerTell;
	
	private Integer categoryId;
}


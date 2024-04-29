package com.techtitans.ecommerce.business.request;

import java.util.ArrayList;
import java.util.List;

import com.techtitans.ecommerce.entities.concretes.Category;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductRequest {
	

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

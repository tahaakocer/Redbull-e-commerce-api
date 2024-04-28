package com.techtitans.ecommerce.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "discount_percentage")
	private double discountPercentage;
	
	@Column(name = "rating")
	private double rating;
	
	@Column(name = "stock")
	private Integer stock;
	
	@Column(name ="brand")
	private String brand;
	
	@Column(name = "thumbnail")
	private String thumbnail;
	
	@Column(name = "seller_name")
	private String sellerName;
	
	@Column(name = "seller_tell")
	private String sellerTell;
	
	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;
	
}

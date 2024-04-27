package com.techtitans.ecommerce.business.responses;

import com.techtitans.ecommerce.entities.concretes.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryGetAllResponse {
	
	private Integer id;
	private String name;
	private String image;
	
}

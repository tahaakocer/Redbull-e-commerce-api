package com.techtitans.ecommerce.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryAddRequest {
	
	private String name;
	private String image;

}

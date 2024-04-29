package com.techtitans.ecommerce.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AtletGetAllResponse {
	
	
	private Integer id;
	private String spor;
	private String name;
	private String imageUrl;
	
}

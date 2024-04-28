package com.techtitans.ecommerce.business.responses;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BannerGetAllResponse {
	
	private Integer id;
	private String url;


}

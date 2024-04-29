package com.techtitans.ecommerce.business.abstracts;

import java.util.List;

import com.techtitans.ecommerce.business.responses.AtletGetAllResponse;

public interface AtletService {
	
	List<AtletGetAllResponse> getAll();
}

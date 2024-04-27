package com.techtitans.ecommerce.business.abstracts;

import java.util.List;

import com.techtitans.ecommerce.business.request.CategoryAddRequest;
import com.techtitans.ecommerce.business.responses.CategoryGetAllResponse;

public interface CategoryService {
	List<CategoryGetAllResponse> getAll();
	void add(CategoryAddRequest categoryAddRequest);
}

package com.techtitans.ecommerce.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtitans.ecommerce.business.abstracts.CategoryService;
import com.techtitans.ecommerce.business.request.CategoryAddRequest;
import com.techtitans.ecommerce.business.responses.CategoryGetAllResponse;
import com.techtitans.ecommerce.core.util.mappers.ModelMapperService;
import com.techtitans.ecommerce.dataAccess.abstracts.CategoryRepository;
import com.techtitans.ecommerce.dataAccess.abstracts.ProductRepository;
import com.techtitans.ecommerce.entities.concretes.Category;

@Service
public class CategoryManager implements CategoryService{
	
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ModelMapperService modelMapperService;

	@Override
	public List<CategoryGetAllResponse> getAll() {
		List<Category> categories = this.categoryRepository.findAll();
		List<CategoryGetAllResponse> categoriesResponse = categories.stream()
				.map(category -> this.modelMapperService.forResponse().map(category, CategoryGetAllResponse.class)).toList();
		
		return categoriesResponse;
	}

	@Override
	public void add(CategoryAddRequest categoryAddRequest) {
		Category category = this.modelMapperService.forRequest().map(categoryAddRequest, Category.class);
		this.categoryRepository.save(category);
	}

}

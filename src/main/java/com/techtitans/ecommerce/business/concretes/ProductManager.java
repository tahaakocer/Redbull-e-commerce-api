package com.techtitans.ecommerce.business.concretes;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtitans.ecommerce.business.abstracts.ProductService;
import com.techtitans.ecommerce.business.responses.ProductGetAllResponse;
import com.techtitans.ecommerce.core.util.mappers.ModelMapperService;
import com.techtitans.ecommerce.dataAccess.abstracts.ProductRepository;
import com.techtitans.ecommerce.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ModelMapperService modelMapperService;

	@Override
	public List<ProductGetAllResponse> getAll() {
		List<Product> products = this.productRepository.findAll();
		List<ProductGetAllResponse> productsResponse = products.stream()
				.map(product -> this.modelMapperService.forResponse().map(product, ProductGetAllResponse.class)).toList();
		return null;
	}
	
}

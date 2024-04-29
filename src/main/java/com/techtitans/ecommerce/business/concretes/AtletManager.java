package com.techtitans.ecommerce.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtitans.ecommerce.business.abstracts.AtletService;
import com.techtitans.ecommerce.business.responses.AtletGetAllResponse;
import com.techtitans.ecommerce.business.responses.BannerGetAllResponse;
import com.techtitans.ecommerce.core.util.mappers.ModelMapperService;
import com.techtitans.ecommerce.dataAccess.abstracts.AtletRepository;
import com.techtitans.ecommerce.entities.concretes.Atlet;
import com.techtitans.ecommerce.entities.concretes.Banner;

@Service
public class AtletManager implements AtletService {

	@Autowired
	private AtletRepository atletRepository;
	
	@Autowired
	private ModelMapperService modelMapperService;
	
	@Override
	public List<AtletGetAllResponse> getAll() {
		List<Atlet> atlets = this.atletRepository.findAll();
		List<AtletGetAllResponse> atletsResponse = atlets.stream()
				.map(atlet -> this.modelMapperService.forResponse().map(atlet, AtletGetAllResponse.class)).toList();
		
		return atletsResponse;
	}

}

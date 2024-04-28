package com.techtitans.ecommerce.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtitans.ecommerce.business.abstracts.BannerService;
import com.techtitans.ecommerce.business.responses.BannerGetAllResponse;
import com.techtitans.ecommerce.business.responses.CategoryGetAllResponse;
import com.techtitans.ecommerce.core.util.mappers.ModelMapperService;
import com.techtitans.ecommerce.dataAccess.abstracts.BannerRepository;
import com.techtitans.ecommerce.entities.concretes.Banner;
import com.techtitans.ecommerce.entities.concretes.Category;

@Service
public class BannerManager implements BannerService{
	
	@Autowired
	private BannerRepository bannerRepository;
	
	@Autowired
	private ModelMapperService modelMapperService;

	@Override
	public List<BannerGetAllResponse> getAll() {
		List<Banner> banners = this.bannerRepository.findAll();
		
		List<BannerGetAllResponse> bannersResponse = banners.stream()
				.map(banner -> this.modelMapperService.forResponse().map(banner, BannerGetAllResponse.class)).toList();
		
		return bannersResponse;
	}


}

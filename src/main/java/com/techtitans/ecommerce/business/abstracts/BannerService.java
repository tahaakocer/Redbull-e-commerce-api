package com.techtitans.ecommerce.business.abstracts;

import java.util.List;

import com.techtitans.ecommerce.business.responses.BannerGetAllResponse;

public interface BannerService {
	List<BannerGetAllResponse> getAll();
}

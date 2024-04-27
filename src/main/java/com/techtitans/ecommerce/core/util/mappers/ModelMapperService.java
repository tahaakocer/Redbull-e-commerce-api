package com.techtitans.ecommerce.core.util.mappers;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
	ModelMapper forResponse();
	ModelMapper forRequest();
}

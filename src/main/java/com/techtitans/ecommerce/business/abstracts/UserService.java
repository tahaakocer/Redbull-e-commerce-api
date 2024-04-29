package com.techtitans.ecommerce.business.abstracts;

import com.techtitans.ecommerce.business.request.UserLoginRequest;
import com.techtitans.ecommerce.business.request.UserRegisterRequest;
import com.techtitans.ecommerce.business.responses.UserGetResponse;
import com.techtitans.ecommerce.core.util.payload.LoginMessage;

public interface UserService {
	String add(UserRegisterRequest userAddRequest);
	LoginMessage loginUser(UserLoginRequest userLoginRequest);
	UserGetResponse getByEmail(String email);
}

package com.techtitans.ecommerce.business.concretes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.techtitans.ecommerce.business.abstracts.UserService;
import com.techtitans.ecommerce.business.request.UserLoginRequest;
import com.techtitans.ecommerce.business.request.UserRegisterRequest;
import com.techtitans.ecommerce.core.util.mappers.ModelMapperService;
import com.techtitans.ecommerce.core.util.payload.LoginMessage;
import com.techtitans.ecommerce.dataAccess.abstracts.UserRepository;
import com.techtitans.ecommerce.entities.concretes.User;

@Service
public class UserManager implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private ModelMapperService modelMapperService;
	
	@Override
	public String add(UserRegisterRequest userRegisterRequest) {
		User user = this.modelMapperService.forRequest().map(userRegisterRequest, User.class);
		user.setPassword(this.passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		return user.getName();
	}
	@Override
	public LoginMessage loginUser(UserLoginRequest userLoginRequest) {
        
        User user1 = this.userRepository.findByEmail(userLoginRequest.getEmail());
        if (user1 != null) {
            String password = userLoginRequest.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = this.userRepository.findOneByEmailAndPassword(userLoginRequest.getEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginMessage("Login Success", true);
                } else {
                    return new LoginMessage("Login Failed", false);
                }
            } else {
                return new LoginMessage("password Not Match", false);
            }
        }else {
            return new LoginMessage("Email not exits", false);
        }
	}

}

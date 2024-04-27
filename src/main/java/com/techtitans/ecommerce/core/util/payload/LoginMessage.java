package com.techtitans.ecommerce.core.util.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginMessage {
	
	String message;
	Boolean status;

}

package com.soul.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	@Autowired
	private OrderService orderService;

	public UserService(){
		System.out.println("userService start");
	}
}

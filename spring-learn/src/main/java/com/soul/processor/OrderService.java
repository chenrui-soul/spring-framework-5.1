package com.soul.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
	@Autowired
	private UserService userService;

	public OrderService() {
		System.out.println("order start");
	}
}

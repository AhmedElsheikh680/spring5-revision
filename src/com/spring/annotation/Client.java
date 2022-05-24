package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class Client implements CompanyInterface {

	@Override
	public void start() {
		System.out.println("Iam Client");
		
	}

}

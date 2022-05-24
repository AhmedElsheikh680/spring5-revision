package com.spring.noxml;

import org.springframework.stereotype.Component;

@Component
public class Sport implements SportInterface {

	@Override
	public void mySport() {
		System.out.println("Iam Sport");
		
	}

}

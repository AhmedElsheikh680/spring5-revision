package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class SportTennis implements Sport {

	@Override
	public void tennis() {
		System.out.println("I Love Tennis");
		
	}

}

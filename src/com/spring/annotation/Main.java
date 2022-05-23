package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SportTennis tennis = context.getBean("sportTennis", SportTennis.class);
		tennis.tennis();
		
		context.close();

	}

}

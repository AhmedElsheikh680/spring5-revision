package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MasterInterface tennis = context.getBean("master", MasterInterface.class);
		tennis.callMySport();
		
		context.close();

	}

}

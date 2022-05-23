package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MasterInterface mster = context.getBean("master", MasterInterface.class);
		mster.name();
		
		context.close();

	}

}

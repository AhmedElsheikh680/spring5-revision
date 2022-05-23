package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Sport football = context.getBean("mySport", Sport.class);
		football.start();
		context.close();
		
		
		
		
//		Sport sport = new Football();
//		sport.start();
		
	
	}

}

package com.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonInterface admin = context.getBean("admin", PersonInterface.class);
		admin.name();
		context.close();
	}
}

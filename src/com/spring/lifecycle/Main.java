package com.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonInterface admin = context.getBean("admin", PersonInterface.class);
		System.out.println(admin);
		PersonInterface admin2 = context.getBean("admin", PersonInterface.class);
		System.out.println(admin2);
		System.out.println(admin == admin2);
		context.close();

	}

}

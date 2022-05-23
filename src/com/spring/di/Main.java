package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = context.getBean("user", User.class);
		User user2 = context.getBean("user", User.class);
		System.out.println(user == user2);
		System.out.println(user.getEmail() + user.getTeam());
		context.close();

	}

}

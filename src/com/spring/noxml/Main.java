package com.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Manager master = context.getBean("manager", Manager.class);
			System.out.println(master.getEmail());
			System.out.println(master.getTeam());
		context.close();

	}

}

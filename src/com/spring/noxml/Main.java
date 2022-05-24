package com.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		MasterInterface master = context.getBean("myMasterInterface", MasterInterface.class);
		master.name();
		master.getMySport();
		context.close();

	}

}

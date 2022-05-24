package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Admin implements PersonInterface {

	@PostConstruct
	public void init() {
		System.out.println("Connected TO DB");
	}
	@Override
	public void name() {
		System.out.println("Iam User");
		
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Not Connected");
	}

}

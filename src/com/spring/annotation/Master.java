package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("master")
@Component
public class Master implements MasterInterface{

	private Sport sport;
	
	@Autowired
	public Master(Sport sport) {
		this.sport = sport;
	}
	@Override
	public void name() {
		System.out.println("Iam Master");
		
	}

	@Override
	public void callMySport() {
		
		sport.tennis();
	}

}

package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("master")
@Component
public class Master implements MasterInterface{
	@Autowired
	@Qualifier("user")
	private CompanyInterface companyInterface;


 
//	@Autowired
//	private Sport sport;
	
//	@Autowired
//	public Master(Sport sport) {
//		this.sport = sport;
//	}
//	@Autowired
//	public void setSport(Sport sport) {
//		this.sport = sport;
//	}
	
	@Override
	public void name() {
		this.companyInterface.start();
		
	}

	@Override
	public void callMySport() {
		
//		sport.tennis();
	}

}

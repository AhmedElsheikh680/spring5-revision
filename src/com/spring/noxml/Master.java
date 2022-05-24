package com.spring.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Master implements MasterInterface{
	
	private SportInterface sportInterface;
	@Autowired
	public Master(SportInterface sportInterface) {
		this.sportInterface = sportInterface;
	}

	@Override
	public void name() {
		System.out.println("Iam Master");
		
	}

	@Override
	public void getMySport() {
		sportInterface.mySport();
	}

}

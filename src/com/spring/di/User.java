package com.spring.di;

public class User implements UserInterface {

	private PersonInterface personInterface;
//	public User(PersonInterface personInterface) {
//		this.personInterface = personInterface;
//	}
	@Override
	public void start() {
		System.out.println("Iam User");
	}
	@Override
	public void getPerson() {
		this.personInterface.begin();
	}
	
	public void setPerson(PersonInterface personInterface) {
		this.personInterface = personInterface;
	}
	

}

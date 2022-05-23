package com.spring.di;

public class User implements UserInterface {

	private PersonInterface personInterface;
	private String email;
	
	@Override
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	private String team;
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
	@Override
	public void doStart() {
		// TODO Auto-generated method stub
		System.out.println("Start");
		
	}
	@Override
	public void doEnd() {
		System.out.println("End");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

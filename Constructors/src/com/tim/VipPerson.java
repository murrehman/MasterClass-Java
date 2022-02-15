package com.tim;

public class VipPerson {
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	public VipPerson (){
		this("default name", 50000.00, "default@email.com");
	}
	
	public VipPerson (String name, double creditLimit){
		this(name, creditLimit, "unknown@email.com");
	}
	
	public VipPerson (String name, double creditLimit, String emailAdress){
		this.name=name;
		this.creditLimit=creditLimit;
		this.emailAddress=emailAdress;
	}
	
	public String getName() {
		return name;
	}
	public double getcreditLimit() {
		return creditLimit;
	}
	
	public String getemailAddress() {
		return emailAddress;
	}

}

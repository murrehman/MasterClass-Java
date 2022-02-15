package com.tim;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VipPerson p1 = new VipPerson();
		System.out.println(p1.getName());
		System.out.println(p1.getcreditLimit());
		System.out.println(p1.getemailAddress());
		
		System.out.println();
		
		VipPerson p2 = new VipPerson("bob", 252525.00);
		System.out.println(p2.getName());
		System.out.println(p2.getcreditLimit());
		System.out.println(p2.getemailAddress());
		
		System.out.println();
		
		
		VipPerson p3 = new VipPerson("tim", 454545.00, "timtimtim@email.com");
		System.out.println(p3.getName());
		System.out.println(p3.getcreditLimit());
		System.out.println(p3.getemailAddress());

	}

}

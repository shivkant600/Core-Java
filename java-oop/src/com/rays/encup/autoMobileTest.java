package com.rays.encup;

public class autoMobileTest {

	public static void main(String[] args) {
		
		AutoMobile a=new AutoMobile();
		
		a.Setcolour("red");
		
		a.setspeed(50);
		
		a.Setmake("tata");
		
		System.out.println(a.getcolour());
		
		System.out.println(a.getmake());
		
		System.out.println(a.getspeed());
	}
}

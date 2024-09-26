package com.rays.encup;

import java.util.Date;

public class PersonTest {
	public static void main(String[] args) {
		Date d = new Date();
		Person c= new Person();
		
		c.Setname("Shivkant");
	System.out.println(c.getname());
	
	
	c.SetAddress("indore");
	
	System.out.println(c.getaddress());
	
	
	c.Setdate(d);
	System.out.println(c.getdate());
		
	}

}

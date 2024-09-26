package com.rays.encup;

import java.util.Date;

public class Person {
	
	private String name;
	private String address;
	private Date dob;
	
	
	public void Setname(String name) {
		this.name=name;
	}

	public String getname() {
		return this.name;
	}
	
	
	public void SetAddress(String address) {
		
		this.address=address;
	}
	
	
	public String getaddress(){
	return	this.address;
		  
	}
	
	public void Setdate(Date dob) {
		this.dob=dob;
	}
	
	public Date getdate() {
		return this.dob;
	}
}

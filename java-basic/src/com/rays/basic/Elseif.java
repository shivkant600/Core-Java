package com.rays.basic;

public class Elseif {
	public static void main(String[] args) {
		String login=null;
		 String password=null;
		
		if(login==null && password==null) {
			
			System.out.println("login id or password is null");
		}
			
		else if(login!="shivv1233") {
			System.out.println("login id is in correct");
			
			
		}
		else if(password!="12356") 
		{
			System.out.println("password is in correct");
		
			
		}
		
	else{
			System.out.println("user login sussecfull");

		}
		
	}

}

package com.rays.basic;

public class Example {
	
	public int add(int a,int b) {
		return a+b;
		
	}
	
	public String name(String a) { 
		return a;
	
	}
	
	
	public char alpha(char a) {
		return a;
	}
	public static void main(String[]args) {
		
		System.out.println("shivkant");
		Example sc=new Example();
		
		int c=sc.add(2,5);
		System.out.println(c);
		
		String dude=sc.name("choudhary");
		System.out.println(dude);
		
		
		char num=sc.alpha('a');
		System.out.println(num);
		
	}

}

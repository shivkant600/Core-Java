package com.rays.basic;

public class MethodShivkant {
	public void Shivkant() {
		System.out.println("choudhary");
	}
	
	public void addition(int a,int b) {
		System.out.println("sum = "+ (a+b));
	}
	
	public int Subtract(int i,int j) {
		return i-j;
		
		
		
	}
	public static void main(String[]args){
		MethodShivkant m=new MethodShivkant();
		
		System.out.println("shivkant");
		
		m.addition(5,4);
		
		
		
		int d;
		d=m.Subtract(10, 8);
		System.out.println(d);
		
		m.Shivkant();

	}

}

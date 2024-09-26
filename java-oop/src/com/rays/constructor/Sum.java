package com.rays.constructor;

public class Sum {

	public Sum() {
		System.out.println("sum constructor");
	}
	
	  //param two constructor
	public Sum(int a,int b){
	
	System.out.println("sum="+(a+b));
	}
	
	public Sum(int c,int d,int e) {
		
		System.out.println("sum of three="+(c+d+e));
	}
}

package com.rays.basic;

public class Swaping {
	public static void main(String[] args) {
		//with third variable
		int a=5;
		int b=6;
		int c;
		
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
		//without third variable
		int i=12;
		int j=14;
		
		i=i+j;  //12+14=26
			j=i-j; //26-14=12
			i=i-j;  //26-12=14
			
			System.out.println(i);
			System.out.println(j);
			
			
			
	}

}

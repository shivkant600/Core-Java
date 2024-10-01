package com.rays.methodoverloading;


public class Methodoverloading {

	   // Yeh method do integers ka sum karta hai
	   public void sum(int a, int b) {
	       System.out.println("sum = " + (a + b));
	   }
	   
	   // Yeh method teen integers ka sum karta hai
	   public void sum(int a, int b, int c) {
	       System.out.println("sum of three = " + (a + b + c));
	   }
	   
	   // Yeh method do doubles ka sum karta hai
	   public void sum(double a, double b) {
	       System.out.println("sum of double = " + (a + b));
	   }  
	}

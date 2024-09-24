package com.rays.basic;

public class Factorial {

	public static void main(String[]args) {
		int a=10;
		int result=1;
		for(int i=a;i>0;i--) {
			result=result*i;
		}
		System.out.println(result);
	}
}

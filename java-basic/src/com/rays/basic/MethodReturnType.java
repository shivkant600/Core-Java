package com.rays.basic;

public class MethodReturnType {

	public char add(char a){
				
			
		return a;

	}

	public static void main(String[] args) {

		MethodReturnType sc = new MethodReturnType();

		char word= sc.add('b');

		System.out.println(word);
	}
}

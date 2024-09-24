package com.rays.basic;

public class Loops {
	public static void main(String[]args) {
		//for loop ( we now the ending condition how many times we have to run the loop)
		for(int i=1;i<=5;i++) {
			System.out.println("hello world");
		}
		
		//while loop (we only no the condition  but we don't how many times run the loop)
		
		int a=1;
	while(a<=5) {
		System.out.println(a +" hello ");
		a++;
	}
	
	//do while (condition true or false but loop run for one time)
	  int b=1;
	do {
		System.out.println(b+"rays");
		b++;
	}while(b<=5);
	
	
	//for each (it only used in arrays)
	int [] name= {5,10,20,40,50,};
	for(int element:name) {
		System.out.println(element);
	}
	
	
	}
}






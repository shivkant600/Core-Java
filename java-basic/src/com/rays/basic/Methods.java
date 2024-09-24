package com.rays.basic;

public class Methods {

	// Yeh method "hellow" ka message print karta hai
	public void hellow() {
		
		System.out.println("hellow world");
	}

	// Yeh method do numbers ka sum calculate karta hai
	public void add(int a, int b) {
		System.out.println("sum is = " + (a + b));
	}

	// Yeh method do numbers ka multiplication calculate karta hai
	public void multi(int i, int j) {
		System.out.println("multi = " + (i * j));
	}

	public static void main(String[] args) {
		// Yahan hum Methods class ka object bana rahe hain taaki hum methods ko call
		// kar sakein
		Methods m = new Methods();

		// hellow method ko call kar rahe hain
		m.hellow();

		// add method ko call karke 2 aur 5 ka sum dekh rahe hain
		m.add(2, 5);

		// multi method ko call karke 2 aur 4 ka multiplication dekh rahe hain
		m.multi(2, 4);
	}
}

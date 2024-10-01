package com.rays.Methodoverriding;

public class Circle extends Shape{
	private int radius;
	
	
	//method overriding main sirf parent class(shape) ki getter or setter method bana tai hai  
	// child class mai constructor banatai hai;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Circle(int radius) {
		this.radius=radius;
	}
	
	public double area() {
		 double area=3.14*radius*radius;
		 
		 return area;
	}

}

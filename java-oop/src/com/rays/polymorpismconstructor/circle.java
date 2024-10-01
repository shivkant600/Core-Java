package com.rays.polymorpismconstructor;

public class circle  extends Shape{
	private int radius;
	public circle() {
		// TODO Auto-generated constructor stub
	}
	
	public circle(int radius) {
		this.radius=radius;
	}

	public double area() {
		double area =Math.PI*radius*radius;
		return area;
	}
}

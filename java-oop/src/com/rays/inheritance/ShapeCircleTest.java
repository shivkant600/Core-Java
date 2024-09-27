package com.rays.inheritance;

public class ShapeCircleTest {
	public static void main(String[] args) {
		
		Circle c=new Circle();
		
		c.setColour("red");
		c.setBorderwith(5);
		c.setRadius(5);
		
		System.out.println( " colour = "+c.getColour());
		System.out.println(" borderwith ="+c.getBorderwith());
		System.out.println("radius ="+c.getRadius());
		System.out.println("area ="+c.area());
	}

}


package com.rays.inheritance;

public class ShapeRectangleTest {

	public static void main(String[] args) {
		
		Rectangle r =new Rectangle();
		
		r.setColour("blue");
		r.setLength(5);
		r.setWidth(4);
		
		System.out.println("  colour ="+r.getColour());
		System.out.println("length ="+r.getLength());
		System.out.println("getwith ="+r.getWidth());
		
		System.out.println("area ="+r.area());
				
			
	}
}

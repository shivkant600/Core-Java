package com.rays.inheritance;

public class SquareTriangleTest {
	public static void main(String[] args) {
		Triangle t=new Triangle();
		
		t.setColour("red");
		t.setHight(10);
		t.setBase(5);
		
		System.out.println("colour= "+ t.getColour());
		System.out.println("height ="+ t.getHight());
		System.out.println("base ="+ t.getbase());
		System.out.println("area="+ t.areatriangle());
		
	
		
		
	}

}

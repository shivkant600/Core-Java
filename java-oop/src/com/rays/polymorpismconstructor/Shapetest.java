package com.rays.polymorpismconstructor;

public class Shapetest {
	public static void main(String[] args) {
		
		Shape[]s=new Shape[3];
		
		
		s[0]=new circle(4);
		
		s[1]=new Rectangle(8,6);
		
		s[2]= new Triangle(6,4);
		
		
		
		
		System.out.println("cicle area="+s[0].area());
		
		System.out.println("rectangle area="+s[1].area());
		
		System.out.println("triangle area="+s[2].area());
		
		
		
	}

}

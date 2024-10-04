package com.rays.polymorpism;

public class ShapetestARRAY {
	
	public static void main(String[] args) {
		
	

	Shape[] s=new Shape[3];
	
	s[0]=new Circle();
	
	s[1]=new Triangle();
	
	s[2]=new Rectangle();
	
	
	
	Circle c=(Circle)s[0];
	c.setRadius(5);
	
	Triangle t=(Triangle)s[1];
    t.setBase(8);
    t.setHeight(10);
    

	
	Rectangle R=(Rectangle)s[2];

	R.setLength(4);
	R.setBreadth(10);
	
	
	
	System.out.println("circle="+s[0].area());
	System.out.println("triangle="+s[1].area());
	System.out.println("rectangle="+s[2].area());
	

}
}
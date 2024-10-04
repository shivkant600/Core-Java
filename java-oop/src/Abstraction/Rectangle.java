package Abstraction;

public class  Rectangle extends Shape {
	
	private int length;
	private int breadth;
	
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
		
	@Override
	public double area() {
	double area=length*breadth;
		return area;
	}
	
	
	

}

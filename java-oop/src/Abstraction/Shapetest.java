package Abstraction;

public class Shapetest {
  public static void main(String[] args) {
	
	  
	  
	  Shape c = new Circle(5);
	  
	  Shape r=new Rectangle(5,10);
	  
	  
	  Shape t=new Triangle(4,8);
	 
       	  
	  
	  System.out.println("circle ="+c.area());
	  
	  
	  System.out.println("rectangle="+r.area());
	  
	  
	  System.out.println("triangle="+t.area());
	  
	  
}
}

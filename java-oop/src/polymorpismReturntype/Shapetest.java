package polymorpismReturntype;

public class Shapetest {
   public static void main(String[] args) {
	
	   Shape[]s=  new Shape[3];
	   
	   s[0]=new Circle();
	   
	   s[1]=new Triangle();
	  
	   s[2]=new Rectangle();
	   
	   
	   Circle c= (Circle)s[0];
	   c.setRadius(5);
	   
	   Triangle t=(Triangle)s[1];
	   t.setLength(4);
	   t.setBreadth(8);
	   
	   
	   Rectangle r=(Rectangle)s[2];
	   r.setbase(4);
	   r.setheight(8);
	   
	   
	   System.out.println("circle area="+s[0].area());
	   
	   System.out.println("rectangle area="+s[1].area());
	   
	   System.out.println("triangle area="+s[2].area());
	   
	   
	   
}
}

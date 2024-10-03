package polymorpismArrgument;

public class ShapeTest {
	
	
	public static double area(Shape[]s){
		
		double totalarea =0.0;
		
		
		for(int i=0;i<s.length;i++) {
			totalarea=totalarea+s[i].area();
		}
		
		return totalarea;
	}
	
	
	
	public static void main(String[] args) {
		
		Shape[]s=new Shape[3];
		
		
		s[0]=new Circle(1);
		
		s[1]=new Triangle(5,10);
		 
		s[2]=new Rectangle(10,10);
	
	
		
		double totalarea =area(s);
		
		System.out.println("total area="+totalarea);
		
		
		
	}

}

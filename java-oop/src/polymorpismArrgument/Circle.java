package polymorpismArrgument;

public class Circle extends Shape {
		private int radius;

	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Circle(int radius) {
		this.radius=radius;
	}
		
		
	     public 	double area(){
			double area=this.radius*this.radius;
			return area;
		}

	}



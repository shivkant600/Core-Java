package polymorpismArrgument;

public class Triangle extends Shape {
		
		private int length;
		private int breadth;

		
		
		public Triangle() {
			// TODO Auto-generated constructor stub
		}
		
		
		
		public Triangle(int length,int breadth) {
			this.length=length;
			this.breadth=breadth;
		}
			
		
		public double area() {
			double area=this.length*this.breadth;
			return area;
		}

	}



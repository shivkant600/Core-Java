package polymorpismArrgument;

public class Rectangle extends Shape {
		private int base;
		private int height;
		
		public Rectangle() {
			// TODO Auto-generated constructor stub
		}
		
		
		public Rectangle(int base,int height) {
			this.base=base;
			this.height=height;
		}
	
		
		public double area () {
			double area=(this.base*this.height)/2;
			return area;
		}

	}



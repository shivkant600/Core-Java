package polymorpismReturntype;

public class Rectangle extends Shape {
	private int base;
	private int height;
	
	
	public int getbase() {
		return base;
	}
	public void setbase(int base) {
		this.base= base;
	}
	public int getheight() {
		return height;
	}
	public void setheight(int height) {
		this.height = height;
	}
	
	public double area () {
		double area=(this.base*this.height)/2;
		return area;
	}

}

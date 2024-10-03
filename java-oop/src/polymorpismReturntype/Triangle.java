package polymorpismReturntype;

public class Triangle extends Shape {
	
	private int length;
	private int breadth;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public double area() {
		double area=this.length*this.breadth;
		return area;
	}

}

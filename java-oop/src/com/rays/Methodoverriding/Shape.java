
package com.rays.Methodoverriding;

public class Shape {
	private String colour;
	private int borderwith;
	
	public void setcolour(String colour) {
		this.colour=colour;
	}
    
	public String getcolour() {
		return this.colour;
	
	}
	
	public void setborderwith(int borderwith) {
		this.borderwith=borderwith;
	}
	
	
	public int getborderwith() {
		return this.borderwith;
	}
	
	
	//overriding
	public double area() {
		return 0.0;
	}
}

package com.rays.inheritance;

public class Triangle extends Shape {
	private int base;
	private int hight;

	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getbase() {
		return this.base;
	}
	
	
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	
	public double areatriangle() {
		double area=(base*hight)/2;
		return  area;
	}

}

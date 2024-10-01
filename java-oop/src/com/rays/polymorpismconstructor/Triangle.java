package com.rays.polymorpismconstructor;

public class Triangle extends Shape {
  private int base;
  private int height;
  
  
  
  
  public Triangle() {
	// TODO Auto-generated constructor stub
}
  
  
  public Triangle(int base ,int height) {
	  this.base=base;
	  this.height=height;
  }
  
  
  public double area() {
	  double area =(base*height)/2;
	  return area;
  }
}

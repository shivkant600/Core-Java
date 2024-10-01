
package com.rays.Methodoverriding;

public class Rectangle extends Shape {
	
	
    // Rectangle ke liye length ka private variable
    private int length;
    
    
    // Rectangle ke liye breadth ka private variable
    private int breadth;

    // Default constructor
    public Rectangle() {
        // TODO Auto-generated constructor stub
    }

    // Parameterized constructor for Rectangle
    public Rectangle(int length, int breadth) {
        this.length = length;  // Length set karna
        
        
        this.breadth = breadth; // Breadth set karna
    }

    // Area calculate karne ka method
    public double area() {
        double area = length * breadth; // Area ka formula
        
        return area; // Area return karna
    }
}

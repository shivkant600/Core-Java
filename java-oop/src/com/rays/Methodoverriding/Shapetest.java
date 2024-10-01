
package com.rays.Methodoverriding;

public class Shapetest {
    public static void main(String[] args) {
    	
    	
    	
        // Circle ka object banana (circle ka area prapt karne ke liye)
        Shape c = new Circle(4);
        
        
        // Rectangle ka object banana (rectangle ka area prapt karne ke liye)
        Shape r = new Rectangle(5, 2);
        
        
        
        // Triangle ka object banana (triangle ka area prapt karne ke liye)
        Shape t = new Triangle(3, 7);

        // Circle ka area print karna
        System.out.println("circle = " + c.area());
        
        // Rectangle ka area print karna
        System.out.println("rectangle = " + r.area());
        
        // Triangle ka area print karna
        System.out.println("triangle = " + t.area());
    }
}


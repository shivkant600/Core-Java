
package com.rays.constructor;

public class Sum {

    // Default constructor
    public Sum() {
        System.out.println("sum constructor"); // Constructor ka message
    }
    
    // Parametrized constructor for two integers
    public Sum(int a, int b) {
        System.out.println("sum = " + (a + b)); // Do numbers ka sum print karna
    }
    
    // Parametrized constructor for three integers
    public Sum(int c, int d, int e) {
        System.out.println("sum of three = " + (c + d + e)); // Teen numbers ka sum print karna
    }
        
    // Parametrized constructor for a string
    public Sum(String a) {
        System.out.println(a); // String ko print karna
    }
}


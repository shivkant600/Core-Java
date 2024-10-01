
package com.rays.methodoverloading;

public class Mehodoverloadingtest {

    public static void main(String[] args) {
        
        // Methodoverloading class ka object banaya
        Methodoverloading m = new Methodoverloading();
        
        // Do integers ka sum karna
        m.sum(4, 5); // Yeh method call karega sum(int a, int b)

        // Teen integers ka sum karna
        m.sum(2, 3, 1); // Yeh method call karega sum(int a, int b, int c)

        // Do integers ka sum karna, lekin yahan alag parameter use karna
        m.sum(1, 2); // Yeh bhi sum(int a, int b) method ko call karega
    }
}

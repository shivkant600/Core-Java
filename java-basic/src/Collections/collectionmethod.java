package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class collectionmethod {
	

	    public static void main(String[] args) {
	        
	      
	        Collection c = new ArrayList();
	        
	        // Collection c mein kuch elements add kar rahe hain
	        c.add(5);         
	        c.add('a');       
	        c.add("name");   
	        c.add(12.0);      
	        
	        
	        System.out.println("C====="+c);
	        
	  
	        Collection b = new ArrayList();
	        
	  
	        b.add(10);         
	        b.add("Shivkant");
	        b.add(true);    
	        b.add(15.0);     
	        
	        
	        System.out.println("b===="+b);
	        
	        // Collection b ke elements ko Collection c mein add kar rahe hain
	        c.addAll(b);
	        System.out.println(c);
	        
	        // Collection c ke elements ko Collection b mein add kar rahe hain
	        b.addAll(c);
	        System.out.println(b);
	        
	        // Collection c ko clear kar rahe hain (saare elements hata rahe hain)
	        c.clear();
	        System.out.println(c);
	        
	        // Check kar rahe hain ki Collection c mein "name" hai ya nahi
	        System.out.println(c.contains("name"));
	        
	        // Check kar rahe hain ki Collection c, Collection b ke saare elements contain karta hai ya nahi
	        System.out.println(c.containsAll(b));
	        
	        // Check kar rahe hain ki Collection c khali hai ya nahi
	        System.out.println("to check wether c is empty or not  ===== "+ c.isEmpty());
	        
	        // c.remove(5); // Ye line comment hai, yahan element 5 ko remove karna chahte the
	        
	        System.out.println(c);
	        
	        // Collection b ke elements ko Collection c mein add kar rahe hain
	        c.addAll(b);
	        System.out.println(c);
	        
	        // Collection b ke elements ko Collection c se remove kar rahe hain
	        c.removeAll(b);
	        System.out.println(c);
	        
	        // Collection c ki size print kar rahe hain
	        System.out.println(c.size());
	    }
	}




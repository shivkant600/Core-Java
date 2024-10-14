package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorexample {
	public static void main(String[] args) {
		
		Vector v =new Vector();
		
		v.add(5);
		v.add(10.1);
		v.add('a');
		v.add("kgf");
		
		System.out.println(v);
		
		System.out.println("---------");
		 Enumeration e=v.elements();
		
		 
		 while(e.hasMoreElements()) {
			 System.out.println(e.nextElement());
		 }
		 
		 
		 
		 
		
	
		
		
		
	}

}

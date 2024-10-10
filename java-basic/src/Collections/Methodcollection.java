package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Methodcollection {
	public static void main(String[] args) {
		
		
		Collection c = new ArrayList();
		
		c.add(5);
		c.add('a');
		c.add("name");
		c.add(12.0);
		
		
		System.out.println("C====="+c);
		
		
		
		
		Collection b=new ArrayList();
		
		b.add(10);
		b.add("Shivkant");
		b.add(true);
		b.add(15.0);
		
		System.out.println("b===="+b);
		
		
		c.addAll(b);
		System.out.println(c);
		
		
		
		b.addAll(c);
		System.out.println(b);
		
		
		
	    c.clear();
		System.out.println(c);
		
		
		
		System.out.println(c.contains("name"));
		
		
		
		System.out.println(c.containsAll(b));
		
		
		System.out.println("to check wether c is empty or not  ===== "+ c.isEmpty());
		
		
		//c.remove(5);
		
		System.out.println(c);
		
		c.addAll(b);
		System.out.println(c);
		
		
		c.removeAll(b);
		System.out.println(c);
		
		
		System.out.println(c.size());
		
		
		
		
		
		
		
	}

}

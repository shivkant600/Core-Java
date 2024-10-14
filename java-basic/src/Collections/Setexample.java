package Collections;

import java.util.HashSet;

import java.util.Set;

public class Setexample {
	public static void main(String[] args) {
		
		
		
		//set contain only one null value
		//set does not contain same value
		Set s =new HashSet();
		
		
		s.add(5);
		s.add(10);
		s.add('a');
		s.add('f');
		s.add("hellow");
		s.add(null);
		
	
		
		System.out.println("values at s=="+s);
		
		
		System.out.println("-----foreachmethod-----");
		
		s.forEach(System.out::println);
		
		
		
	}

}

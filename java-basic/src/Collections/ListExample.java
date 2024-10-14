package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		
		//list is natural value
		//it contain multiple null value
	
		List l= new ArrayList();
		
		
		
		
		l.add(555);
		l.add(5);
		l.add(10);
		l.add("hellow");
		l.add( 'a');
		l.add(2);
		l.add('f');
		l.add(555);
		l.add(555);
		l.add(555);
		//System.out.println(l.get(0));
		
		
		//System.out.println(l.remove(2));
		
		
		//System.out.println(l.subList(1, 4));
		
		System.out.println(l.indexOf(555));
		
		System.out.println(l.lastIndexOf(555));
		
	   
		
		System.out.println("VALUES AT L=="+ l);
		

		
		
		
		System.out.println("-------iterator-----");
		
		Iterator it = l.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	
	
		
		System.out.println("-----foreach method-------");
		
		
		l.forEach(System.out::println);
		

		}
		
	}


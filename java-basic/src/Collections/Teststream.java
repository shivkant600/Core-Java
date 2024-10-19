package Collections;

import java.util.ArrayList;
import java.util.List;

public class Teststream {
	
	public static void main(String[] args) {
		
		
		List<String> l = new ArrayList<String>();
		
		l.add("ram");
		l.add("shivam");
		l.add("ankit");
		l.add("karan");
		l.add("karan");
		l.add("nitin");
		
		
		
		System.out.println("-----normal type-----");
		System.out.println(l);
		
		
		System.out.println("---foreach method---");
			l.forEach(System.out::println);	
			
			System.out.println("---sorted list---");
			l.stream().sorted().forEach(System.out::println);
			
			
			System.out.println("-----list in upper case----");
			l.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		
			
			System.out.println("-----remove duplicate value---");
			
			l.stream().distinct().forEach(System.out::println);
			
			
			System.out.println("----start with---");
			l.stream().filter(e ->e.startsWith("a")).distinct().limit(1).forEach(System.out::println);
				
				
				
				
	}

}

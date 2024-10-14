package Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		
		Queue q = new ArrayDeque();
		
		q.offer(5);
		q.offer(10);
		q.offer('a');
		q.offer("hellow");
		q.offer('f');
		
		//poll remove the first element
		System.out.println(q.poll());
		
		//first element print
		q.peek();
		
		System.out.println(q);
		
		System.out.println("q value contain ="+ q);
		
		
		System.out.println("----for each method---");
		
		q.forEach(System.out::println);
	
	}

}

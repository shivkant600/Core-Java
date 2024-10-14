package Collections;

import java.util.Stack;

public class Stackexample {

	public static void main(String[] args) {
		
		Stack s =new Stack();
		
		s.push(5);
		s.push(10);
		
		s.push('a');
		
		s.push("hghh");
		
		System.out.println(s);
		
		while(!s.empty()) {
			System.out.println(s.pop());
		}

		
		
	}
}

package practice;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push("A");// First is the last
		s.push(123);
		s.push(true);
		s.push('c');//Last is the first
		
		System.out.println(s);
		Object obj = s.peek();
		
		System.out.println();
		
		System.out.println(s.search('c'));
		
	}

}

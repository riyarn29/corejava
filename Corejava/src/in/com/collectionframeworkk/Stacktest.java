package in.com.collectionframeworkk;

import java.util.Stack;

public class Stacktest {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(5);
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
	}

}

package in.com.collectionframeworkk;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
public static void main(String[] args) {
	Queue q=new LinkedList();
	q.add("abc");
	q.add(1);
	q.add(0.1);
	q.add("xyz");
	q.add(1);
	System.out.println(q);

	//System.out.println(q);
	q.offer("abcdeee");
	System.out.println(q);
	
	System.out.println(q.peek());
	q.poll();
	System.out.println(q);
	
	System.out.println(q.element());
	System.out.println(q);
	q.poll();
	System.out.println(q);
	
	
	
	
	
	
	
}
}

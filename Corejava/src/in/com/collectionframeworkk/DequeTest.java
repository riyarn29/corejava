package in.com.collectionframeworkk;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class DequeTest {
public static void main(String[] args) {
	Deque d=new ArrayDeque();
	d.add("one");
	d.add("two");
	d.add("three");
	d.add("four");
	d.add("five");
	d.addFirst(1);
	d.addLast(5);
	System.out.println(d);
	d.removeLast();
	d.removeFirst();
	System.out.println(d);
	System.out.println(d.getFirst());
	System.out.println(d.getLast());
	d.offerFirst(11);
	d.offerLast(55);
	d.offerLast(55);
	
	System.out.println(d);
	System.out.println(d.peekFirst());
	System.out.println(d.peekLast());
	System.out.println(d);
	System.out.println(d.pollFirst());
	System.out.println(d.pollLast());
	System.out.println(d);
}
}

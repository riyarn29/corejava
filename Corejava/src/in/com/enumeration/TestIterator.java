package in.com.enumeration;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class TestIterator {
public static void main(String[] args) {
	ArrayBlockingQueue list = new ArrayBlockingQueue(5);
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	
	Iterator it = list.iterator();
	list.add(1000);
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
}
}

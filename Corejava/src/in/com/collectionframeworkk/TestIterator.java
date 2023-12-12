package in.com.collectionframeworkk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
public static void main(String[] args) {
	
	List c =new ArrayList();
	c.add(1);
	c.add(2);
	c.add(3);
	
	System.out.println(c);
	
	
	
	//method 1
	for(int i=1;i<c.size();i++) {
		System.out.println(c.get(i));
	}
	
	//method 2
	for (Object ob:c) {
		System.out.println(ob);
	}
	
	//method 3
	Iterator it=c.iterator();
	while(it.hasNext()) {
		Object o=it.next();
		System.out.println(o);
	}
	
}
}

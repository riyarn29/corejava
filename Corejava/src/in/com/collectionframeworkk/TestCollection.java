package in.com.collectionframeworkk;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
public static void main(String[] args) {
	Collection c=new ArrayList();
	c.add('a');
	c.add('b');
	c.add('c');
	c.add('d');
	c.add(4);
	c.add('a');
	c.add(null);
	c.add(null);
	Collection c2=new ArrayList();
	c2.add(1);
	c2.add(2);
	c2.add(3);
	c2.add(4);
	
	
	System.out.println(c);
	
	System.out.println(c2);
	
	c2.addAll(c);
	System.out.println(c2);
	
	System.out.println(c.contains('e'));
	System.out.println(c2.contains(4));
	
	System.out.println(c2.containsAll(c));
	System.out.println(c.containsAll(c2));
	
	
	c.remove(4);
	System.out.println(c);
	
	c2.removeAll(c);
	System.out.println(c2);
	
c2.clear();
	System.out.println(c2.size());
	
	System.out.println(c.isEmpty());
	
	System.out.println(c.size());
	
	c.retainAll(c2);
	System.out.println(c);

	
	
	
	
}
}

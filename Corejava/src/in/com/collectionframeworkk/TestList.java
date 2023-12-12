package in.com.collectionframeworkk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
	List l=new ArrayList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add("xyz");
	l.add(null);
	l.add(null);
//l.removeAll(l);

	System.out.println(l);

	
	l.add(2,"abc");
	System.out.println(l);
	
	
	System.out.println(l.get(2));
	
	l.remove(1);
	l.remove("abc");
	System.out.println(l);
	
	l.set(1,"xyz");
	System.out.println(l);
	
	System.out.println(l.indexOf(10));
	
	System.out.println(l.lastIndexOf("xyz"));
	
System.out.println(	l.subList(1, 3));

Iterator it=l.iterator();
while(it.hasNext()) {
Object o=it.next();
System.out.println(o);


	}
	}
}

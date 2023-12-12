package in.com.collectionframeworkk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListT {
public static void main(String[] args) {
	ArrayList l = new ArrayList();
	l.add("zero");
	l.add("one");
	l.add("two");
	l.add("three");
	
	l.add(0, "five");
	System.out.println(l);
	
	//get value using index no
	System.out.println(l.get(1));
	
	//sorting
	Collections.sort(l);
	System.out.println(l);
	
	//create a sublist
	ArrayList subList =new ArrayList(l.subList(1, 4));
	System.out.println(subList);

}
}

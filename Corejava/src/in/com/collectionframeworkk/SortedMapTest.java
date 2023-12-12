package in.com.collectionframeworkk;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTest {
public static void main(String[] args) {
	SortedMap m=new TreeMap();
	m.put(1, "one");
	m.put(4, "four");
	m.put(2, "two");
	m.put(3, "three");
	m.put(5, "five");
	System.out.println(m);
	
}
}

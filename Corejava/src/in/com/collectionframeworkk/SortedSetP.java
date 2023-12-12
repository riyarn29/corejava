package in.com.collectionframeworkk;


import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetP {
public static void main(String[] args) {
	SortedSet s=new TreeSet();
	s.add(1);
	s.add(2);
	s.add(3);
	s.add(5);
	s.add(0);
	s.add(-2);
	System.out.println(s);
	System.out.println(s.first());
	System.out.println(s.last());
	System.out.println(s.headSet(1));
	System.out.println(s.tailSet(2));
	System.out.println(s.subSet(3, 4));
	
	SortedSet ss=new TreeSet();
	ss.add("one");
	ss.add("two");
	System.out.println(ss);
	
	SortedSet s1=new TreeSet();
	s1.add('a');
	s1.add('z');
	s1.add('c');
	System.out.println(s1.headSet('c'));
	s1.add('c');
	System.out.println(s1);
}
}

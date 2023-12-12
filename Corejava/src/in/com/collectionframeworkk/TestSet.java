package in.com.collectionframeworkk;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
public static void main(String[] args) {
	Set s=new HashSet();
	s.add('a');
	s.add("abc");
	s.add(null);
	s.add('a');
	s.add(null);
	System.out.println(s);
}
}

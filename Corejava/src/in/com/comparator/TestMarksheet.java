package in.com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet  {
public static void main(String[] args) {
	
	List l=new ArrayList<Marksheet>();
	
	l.add(new Marksheet(1,"riya",99));
	l.add(new Marksheet(5,"riya",99));
	l.add(new Marksheet(3,"saks",78));
	l.add(new Marksheet(2,"sidd",66));
	l.add(new Marksheet(4,"jign",51));

Collections.sort(l, new OrderByIDdesc());
for (Object object : l) {
	System.out.println(object);
}

}
}
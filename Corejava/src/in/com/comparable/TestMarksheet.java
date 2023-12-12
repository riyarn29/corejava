package in.com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
public static void main(String[] args) {
	List l=new ArrayList<Marksheet>();
	l.add(new Marksheet(1,"riya",19));
	l.add(new Marksheet(1,"akshi",29));
	l.add(new Marksheet(3,"roman",12));
	l.add(new Marksheet(2,"oman",1));
	
	Collections.sort(l);
	for (Object object : l) {
		System.out.println(object);
	}
	
	
}
}

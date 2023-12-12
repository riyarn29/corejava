package in.com.collectionframeworkk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MarksheetTest {
	List<Marksheet> list=new ArrayList<Marksheet>();
	
	public void name(List<Marksheet> list) {
	Iterator<Marksheet>it=list.iterator();
	while(it.hasNext()) {
		Marksheet m1=it.next();
		if(m1.name.equals("jiya")) {
			System.out.println(m1.id + m1.name + m1.marks);
		}
	}
	}
public static void main(String[] args) {
	
	//Marksheet m=new Marksheet(1,"riya",45); (instead of this use below method)
	
	List<Marksheet> list=new ArrayList<Marksheet>();
	list.add(new Marksheet(1,"jiya",78));
	list.add(new Marksheet(3,"jiya",99));
	list.add(new Marksheet(2,"roman",19));
	list.add(new Marksheet(4,"sakshi",37));
	list.add(new Marksheet(5,"siddhu",65));
	//System.out.println(list);
	Collections.sort(list);
	
	for (Marksheet marksheet : list) {
		System.out.println(marksheet);
	}
	MarksheetTest m2=new MarksheetTest();
	m2.name(list);
}
}

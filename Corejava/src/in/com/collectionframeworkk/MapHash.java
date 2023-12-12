package in.com.collectionframeworkk;

import java.util.HashMap;
import java.util.Map;

public class MapHash {
	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(2,"xyz", 1000);
		Employee1 e2 = new Employee1(1,"Abc", 2000);
		Employee1 e3 = new Employee1(1,"Abc", 2000);
		
Map m=new HashMap();
m.put(e1,1.1);
m.put(e2, 2.2);
m.put(e3, 3.2);


System.out.println(m);
System.out.println(e2.hashCode());
System.out.println(e3.hashCode());

	}
	
	
}

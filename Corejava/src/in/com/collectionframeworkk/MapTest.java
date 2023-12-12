package in.com.collectionframeworkk;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
public static void main(String[] args) {
	Map m=new HashMap();
	m.put("name","Riya");
	m.put("ID","21");
	m.put("class","BBA 2");
	System.out.println(m.entrySet());
	System.out.println(m.keySet());
	Map m1=new HashMap();
	m1.put("1", "riii");
	m1.putAll(m);
	m1.remove("1");
	
	System.out.println(m1);
	
	System.out.println(m);
	m.clear();
	System.out.println(m);
	
	
	
	
	System.out.println(m.containsKey("Class"));
	System.out.println(m.containsValue("21"));
	
	System.out.println(m.get("name"));
	System.out.println(m.isEmpty());
	System.out.println(m.keySet());
	m.remove("class");
	System.out.println(m);
	System.out.println(m.size());
	System.out.println(m.values());
	
	m.entrySet();
}
}

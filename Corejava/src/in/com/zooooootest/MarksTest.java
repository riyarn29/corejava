package in.com.zooooootest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarksTest {
public static void main(String[] args) {
List l=new ArrayList<Marks>();
l.add(new Marks(2,"riya",89));
l.add(new Marks(3,"sakshi",19));
l.add(new Marks(1,"roman",78));

Collections.sort(l);
for (Object object : l) {
	System.out.println(object);
}
}
}

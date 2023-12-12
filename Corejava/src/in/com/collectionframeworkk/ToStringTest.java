package in.com.collectionframeworkk;

import java.util.ArrayList;
import java.util.List;

public class ToStringTest {
public static void main(String[] args) {
	ToStringP e=new ToStringP(1,"ab","1000");
	ToStringP e1=new ToStringP(1,"abc","1000");
	ToStringP e2=new ToStringP(1,"abc","1000");
	
	List list=new ArrayList();
	list.add(e1);
	list.add(e);
	System.out.println(list);

	//(contains method internally calls equals method to check if an element is present in the list
	//or not,here e2 is not a list but thn too we can check)
	
	System.out.println(list.contains(e2));
	
	System.out.println(e1);
	System.out.println(e);
	System.out.println(e.equals(e1));
	System.out.println(e.hashCode());
	System.out.println(e1.hashCode());
}
}

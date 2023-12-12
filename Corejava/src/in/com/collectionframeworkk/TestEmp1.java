package in.com.collectionframeworkk;

import java.util.ArrayList;
import java.util.List;

public class TestEmp1 {
public static void main(String[] args) {
	Employee1 e1 = new Employee1(2, "Abc", 2000);
	Employee1 e2 = new Employee1(2, "Abc", 2000);
	
System.out.println(e1);
System.out.println(e2);
	
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals("sdk"));
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
}
}

package in.com.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
public static void main(String[] args) {
	List<String>list=new ArrayList<String>();
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	list.add("five");
	for (String string : list) {
		System.out.println(string);
	}
}
}

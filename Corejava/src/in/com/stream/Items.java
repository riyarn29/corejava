package in.com.stream;

import java.util.Arrays;
import java.util.List;

public class Items {
public static void main(String[] args) {

	String item[]= {"bag","lipstick","compact","blush","brush","bag"};
	
	List<String> l=Arrays.asList(item);
	
//	l.stream().forEach(e-> {System.out.println(e);});
	
//l.stream().map(e-> e.toUpperCase()).distinct().filter(e-> e.startsWith("B")).limit(3).skip(2).forEach(e-> {System.out.println(e);});



}
}
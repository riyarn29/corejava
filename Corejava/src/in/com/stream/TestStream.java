package in.com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args) {
		
		String num[]= {"one","two","three","four","five","three"};
		
		//array to list
		List<String> s1=Arrays.asList(num);
		
		//list to stream
		Stream<String> stream=s1.stream();
		
		stream.forEach(e -> {System.out.println(e);});
		
		
	s1.stream().sorted().forEach(e -> {System.out.println(e);});
		
		s1.stream().map(e-> e.toUpperCase()).forEach(e-> {System.out.println(e);});
	
		s1.stream().filter(e -> e.startsWith("t")).distinct().map(e-> e.toLowerCase()).sorted().forEach(e-> {System.out.println(e);});
}
}
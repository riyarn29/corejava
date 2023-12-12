package in.com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestContestant {
public static void main(String[] args) {
	
	ArrayList<Contestant> list=new ArrayList<Contestant>();
	list.add(new Contestant("riya","9988225577"));
	list.add(new Contestant("sakshi","9911225577"));
	list.add(new Contestant("roman","2288225577"));
	list.add(new Contestant("siddhu","9988225567"));
	list.add(new Contestant("jignesh","9988225477"));
	list.add(new Contestant("jiya","9124225577"));
	list.add(new Contestant("mighty","8225577"));
	list.add(new Contestant("tanishq","998822557766"));
	list.add(new Contestant("tanu","998820025577"));
	list.add(new Contestant("coco","9988227877"));
	
list.stream().map(e-> e.phone).filter(e-> e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(),e-> {Collections.shuffle(e); return e.stream();})).limit(3).forEach(e-> {System.out.println(e);});
	
}
}

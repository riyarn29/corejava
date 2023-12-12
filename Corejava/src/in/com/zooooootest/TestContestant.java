package in.com.zooooootest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestContestant {
public static void main(String[] args) {
	List<Contestant> l=new ArrayList<Contestant>();
	l.add(new Contestant("8989188121", "riya"));
	l.add(new Contestant("89891881", "riya1"));
	l.add(new Contestant("8989121", "riya2"));
	l.add(new Contestant("8989666188121", "riya3"));
	l.add(new Contestant("8989177121", "riya4"));
	l.add(new Contestant("8989166121", "riya5"));
	l.add(new Contestant("8989155121", "riya6"));
	l.add(new Contestant("8989144121", "riya7"));
	
	l.stream().map(e-> e.phone).distinct().filter(e-> e.length()==10).collect(Collectors.collectingAndThen(Collectors.toList(), e->{Collections.shuffle(e);return e.stream();})).limit(3).forEach(e-> {System.out.println(e);}); 
}
}


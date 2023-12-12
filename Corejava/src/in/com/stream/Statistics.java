package in.com.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Statistics {
public static void main(String[] args) {
	List<Integer> marks= Arrays.asList(80,79,43,21,56,78,90);
	IntSummaryStatistics i=marks.stream().mapToInt(e -> e).summaryStatistics();
	
	System.out.println("max="+i.getMax());
	System.out.println("min="+i.getMin());
	System.out.println("avg="+i.getAverage());
	System.out.println("sum="+i.getSum());
}
}

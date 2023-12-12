package in.com.comparator;

import java.util.Comparator;

public class OrderByID implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet m1,Marksheet m2) {
		
		return m1.id-m2.id;
	}

}

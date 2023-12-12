package in.com.comparator;

import java.util.Comparator;

public class OrderByIDdesc implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1,Marksheet m2) {
		
		return m2.id-m1.id;
	}
}

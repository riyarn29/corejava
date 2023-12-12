package in.com.serialization;

import java.io.Serializable;

public class Marksheet implements Serializable {
	
public String name=null;
public int maths=0;
public int physics=0;
public int chemistry=0;
public transient  int total=0;

public int getTotal() {
	total=maths+physics+chemistry;
	return total;
}
}

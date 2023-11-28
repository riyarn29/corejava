package in.com.shape;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestClass {
public static void main(String[] args) throws ParseException {

	
	
	Yayyaya y=new Yayyaya();
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	y.setDob(sdf.parse("29-01-2004"));
	y.setName("riya");
	System.out.println(y.getName());
	System.out.println(sdf.format(y.getDob()));
	
	}
}
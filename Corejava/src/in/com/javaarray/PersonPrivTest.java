package in.com.javaarray;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PersonPrivTest {
public static void main(String[] args) throws ParseException {
	PersonPriv p= new PersonPriv();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	p.setDate(sdf.parse("01/09/2006"));
	p.setId(103);
	p.setName("riya");
	System.out.println(p.getId());
	System.out.println(p.getName());
	System.out.println(sdf.format(p.getdob()));
	System.out.println(p.AVG_AGE);
}
}

package in.com.javacore;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Testpeople {

	People p1=new People(); 
	
	
public static void main(String[] args) throws ParseException {
	
	
	SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy");
	People pp=new People();
	pp.setAddress("83 ab road");
	pp.setName("riya");
	pp.setDob(new SimpleDateFormat("dd/MM/yyyy").parse("29/01/2004"));
	pp.setDatee(sdf.parse("07-09-2007"));
	
	System.out.println(pp.getAddress());
	System.out.println(pp.getName());
	System.out.println(People.AVG_AGE);
	System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(pp.getDob()));
	System.out.println(sdf.format(pp.getdatee()));
}
}

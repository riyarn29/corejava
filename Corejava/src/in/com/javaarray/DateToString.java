package in.com.javaarray;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {
	public static void main(String[] args) {
	
Date today=new Date();
System.out.println(today);
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
String s=sdf.format(today);
System.out.println(s);

SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
String ss=sd.format(today);
System.out.println(ss);


//mili seconds from 1970
System.out.println(today.getTime());
}
}

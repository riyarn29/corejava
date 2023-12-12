package in.com.javaarray;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarString {
public static void main(String[] args) throws ParseException {
	String s="29/01/2004";
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	Date d=sdf.parse(s);
	Calendar cal=Calendar.getInstance();
	cal.setTime(d);
	cal.add(Calendar.DATE,60);
	System.out.println(sdf.format(cal.getTime()));
}
}

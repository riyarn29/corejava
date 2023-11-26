package in.com.oops;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Riya {
	public static void main(String[]args) throws ParseException {
		
		//ternary operator
	int a=2;
	int b=4;
	int c=(a>b)?a:b;
	System.out.println(c);
	
	
	int num=10;
	System.out.println(~num);
	System.out.println(num<<2);
	
	Date d =new Date();
	Calendar cal =Calendar.getInstance();
	cal.setTime(d);
	for(int i=0;i<=12;i++) {
		
	
	cal.add(Calendar.DATE,30);
	System.out.println(cal.getTime());
	}
	}
}

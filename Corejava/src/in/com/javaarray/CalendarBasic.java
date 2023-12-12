package in.com.javaarray;

import java.util.Calendar;
import java.util.Date;

public class CalendarBasic {
public static void main(String[] args) {
Date d=new Date();

Calendar c=Calendar.getInstance();
c.setTime(d);
c.add(Calendar.DATE,-20);
System.out.println(c.getTime());
}
}

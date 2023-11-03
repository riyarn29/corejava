package in.com.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Testcalender {
public static void main(String[] args) throws ParseException {

Date d=new Date();
Calendar cal= Calendar.getInstance();
cal.setTime(d);
cal.add(Calendar.DATE,-20);
System.out.println(cal.getTime());


//imp to convert string into date to perform calendar operations like shown below:-

String s="29/01/2004";
SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
Date dd= sdf.parse(s);
Calendar call =Calendar.getInstance();
cal.setTime(dd);
cal.add(Calendar.DATE,-1);
System.out.println(sdf.format(call.getTime()));


}
}

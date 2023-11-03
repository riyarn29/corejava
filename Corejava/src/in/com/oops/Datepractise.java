package in.com.oops;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datepractise {
public static void main(String[] args) {

Date d= new Date();
System.out.println(d);
System.out.println(d.getTime());


SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
String s = sdf.format(d);
System.out.println(s);

SimpleDateFormat sd= new SimpleDateFormat ("MMM dd, yyyy");
String str = sd.format(d);
System.out.println(str);

}
}

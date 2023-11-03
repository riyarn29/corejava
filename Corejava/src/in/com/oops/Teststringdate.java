package in.com.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teststringdate {
public static void main(String[] args) throws ParseException {
String s ="29-01-2004";
SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
Date d= sdf.parse(s);
System.out.println(d);

}
}

package in.com.javacore;


import java.time.LocalDate;
import java.time.Period;

public class EmployeeAge {
public static void main(String[] args) {
	
	String dob= "29/01/2004";
	String [] arr=dob.split("/");
	int d=Integer.parseInt(arr[0]);
	int m=Integer.parseInt(arr[1]);
	int y=Integer.parseInt(arr[2]);
	
	var d1=LocalDate.of(y, m,d);
	var d2=LocalDate.now();
	var p=Period.between(d1, d2);
	
	System.out.println("age= "+p.getYears()+"years " +p.getMonths()+"months " +p.getDays()+"days");
	
	
	
 
}
}

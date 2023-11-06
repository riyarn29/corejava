package in.com.javacore;

import in.com.oops.Person;

public class Testperson {
public static void main(String[] args) {
	

	Person p= new Person();
	//p.id=100;
	//p.firstName="Riya";
	//p.lastName="Rana";
	
	//System.out.println(p.id);
	//System.out.println(p.firstName);
	//System.out.println(p.lastName);
	
	
	
	p.setFirstName("riya");
	p.setId(24);
	p.setLastName("rana");
	System.out.println(p.getFirstName());
	System.out.println(p.getId());
	System.out.println(p.getLastName());
	System.out.println(Person.AVG_AGE);
	
	
	
}
}
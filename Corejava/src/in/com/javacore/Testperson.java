package in.com.javacore;

import in.com.oops.Person;

public class Testperson {
public static void main(String[] args) {
	

	Person p= new Person();
	p.id=100;
	p.name="Riya";
	p.ch='a';
	String ss=p.nn();
	System.out.println(p.id);
	System.out.println(p.name);
	System.out.println(p.ch);
	System.out.println(ss);
	
}
}
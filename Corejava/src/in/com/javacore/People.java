package in.com.javacore;

import java.util.Date;

public class People {

private String name;
private Date dob;
private String address;
public static final int AVG_AGE=19;
private Date datee;

public People() {
	System.out.println("Default constructor");
}
	
	public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setDob(Date dob) {
	this.dob=dob;
	
}
public Date getDob() {
	return dob;
}
public void setAddress(String address) {
	this.address=address;
}
public String getAddress() {
	return address;
}
	public void setDatee(Date dd){
		this.datee=dd;
	}
	public Date getdatee() {
		return datee;
	}
	
	public People(String address) {
		this.address=address;
		System.out.println(address);
	}
		
		
		
		
	}


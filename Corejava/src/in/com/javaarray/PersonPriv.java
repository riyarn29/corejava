package in.com.javaarray;

import java.util.Date;

public class PersonPriv {
private int id;
private String name;
private Date dob;
public static final int AVG_AGE=19;

public void setId(int id) {
	this.id=id;
}
public int getId() {
	return id;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setDate(Date dob) {
	this.dob=dob;
}
public Date getdob() {
	return dob;
}

}

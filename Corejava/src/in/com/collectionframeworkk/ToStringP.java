package in.com.collectionframeworkk;

public class ToStringP {
private int id;
private String name;
private String salary;

public ToStringP(int id,String name,String salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
}
public int getId() {
	return id;
}
public String getSalary() {
	return salary;
}
public String getName() {
	return name;
}
@Override
	public String toString() {
		
		return this.id +" "+ this.name+" "+this.salary;
}
@Override
public boolean equals(Object obj) {
	ToStringP s=(ToStringP)obj;
	boolean b= s.id==this.id && s.name==this.name && s.salary==this.salary;
	return b;	
}

@Override
	public int hashCode() {
	String str= id + name + salary;
		return str.hashCode();
	}
}

package in.com.zooooootest;

public class Employee {
private String name;
private int salary;
private int id;

public Employee(String name,int salary,int id) {
	this.id=id;
	this.name=name;
	this.salary=salary;
}
@Override
	public String toString() {
		
		return id+" "+" "+ salary+" "+ name;
	}
}

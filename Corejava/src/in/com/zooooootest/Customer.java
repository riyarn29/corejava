package in.com.zooooootest;

public class Customer implements Cloneable{
public String name;
public Account acc;
public Customer(String name) {
	this.name=name;
	this.acc=new Account(500);
	
}
@Override
	protected Object clone() throws CloneNotSupportedException {
	Customer c=(Customer)super.clone();
	c.acc=(Account)acc.clone();
	return c;
	
		}
}

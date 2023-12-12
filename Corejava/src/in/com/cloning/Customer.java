package in.com.cloning;

public class Customer implements Cloneable{
public String name=null;
public Account accounts=null;
public Customer(String name) {
	this.name=name;
	this.accounts=new Account(300);
}
@Override
	protected Object clone() throws CloneNotSupportedException {
	
		Customer c=(Customer)super.clone();
		c.accounts=(Account)accounts.clone();
		return c;
	}
}

package in.com.cloning;

public class Customer implements Cloneable {
	public String name=null;
	public Accounts account=null;
	
	public Customer(String name) {
		this.name=name;
		this.account=new Accounts(300);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
	Customer c=(Customer)super.clone();
	c.account=(Accounts)account.clone();
	return c;
	}

}
package in.com.cloning;

public class TestDeepCloning {
public static void main(String[] args) throws CloneNotSupportedException {
	Customer c=new Customer("riya");
	Customer c2=(Customer)c.clone();
	c2.name="rana";
	c2.accounts.balance=500;
	System.out.println(c2.name);
	System.out.println(c2.accounts.balance);
	System.out.println(c.name);
	System.out.println(c.accounts.balance);
}
}

package in.com.zooooootest;

public class TestDeep {
public static void main(String[] args) throws CloneNotSupportedException {
	
	Customer c=new Customer("riya");
	Customer c2=(Customer)c.clone();
	c2.name="rana";
	c2.acc.balance=1000;
	
	System.out.println(c.name);
	System.out.println(c.acc.balance);
	System.out.println(c2.name);
	System.out.println(c2.acc.balance);
	
	
}
}

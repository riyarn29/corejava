package in.com.cloning;

public class TestShallowCloning {
public static void main(String[] args) throws CloneNotSupportedException {
	
	Accounts a1=new Accounts(100);
	Accounts a2=(Accounts) a1.clone();
	a2.balance=200;
	System.out.println(a1.balance);
	System.out.println(a2.balance);
	
}
}


package in.com.cloning;

public class TestShallowCloning {
public static void main(String[] args) throws CloneNotSupportedException  {
	
	Accounts a=new Accounts(100);
	Accounts a2=(Accounts)a.clone();
	a2.balance=200;
	
	System.out.println(a.balance);
	System.out.println(a2.balance);
	
}
}


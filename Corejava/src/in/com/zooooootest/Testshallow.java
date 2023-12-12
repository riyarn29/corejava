package in.com.zooooootest;

public class Testshallow {
public static void main(String[] args) throws CloneNotSupportedException {
	Account a=new Account(100);
	Account a2=(Account)a.clone();
	a2.balance=200;
	System.out.println(a2.balance);
	System.out.println(a.balance);
}
}

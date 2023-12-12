package in.com.thread;

public class Account {
private int balance=0;

public void setBalance(int balance) {
	try {
		Thread.sleep(20);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	this.balance = balance;
}
public int getBalance() {
	try {
		Thread.sleep(20);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	return balance;
}
public void deposit(int amount,String name) {
	synchronized (this){
	int total=getBalance()+amount;
	setBalance(total);
	}
	System.out.println(name+" balance="+getBalance());
	
	
	
}
}

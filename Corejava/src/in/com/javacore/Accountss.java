package in.com.javacore;

public class Accountss {

private int balance;
public void setBalance(int balance) {
	this.balance = balance;
}
public int getBalance() {
	return balance;
}
public void deposit(int amount) {
setBalance(getBalance()+amount);
System.out.println("balance after deposit="+getBalance());
}
public void withdrawl(int amount) {
	int total= getBalance()-amount;
	if(total<2000) {
		System.out.println("low balance");
}else {
	setBalance(total);
	System.out.println("balance after withdrawl="+getBalance());
}
	
}}
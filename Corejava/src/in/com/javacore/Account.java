package in.com.javacore;

public class Account {

private String number;
private String accountType;
private double balance;

public void setNumber(String number) {
	this.number=number;
}
public String getNumber() {
	return number;
}
public void setAccounttype(String type) {
	this.accountType=type;
	
}
public String getAccountType() {
	return accountType;
	
}
public void setBalance(double balance) {
	this.balance=balance;
}
public double getBalance() {
	return balance;
	
}
}

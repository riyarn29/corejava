package in.com.cloning;

public class Accounts implements Cloneable {

public int balance=0;

public Accounts(int balance) {
	this.balance=balance;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

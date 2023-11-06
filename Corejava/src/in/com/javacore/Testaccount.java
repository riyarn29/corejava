package in.com.javacore;

public class Testaccount {
	public static void main(String[] args) {
		
		Account a =new Account();
		a.setAccounttype("saving");
		a.setBalance(1500.76);
		a.setNumber("11222335569");
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());
		System.out.println(a.getNumber());
	}

}

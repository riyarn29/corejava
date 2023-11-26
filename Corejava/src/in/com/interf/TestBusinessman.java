package in.com.interf;

public class TestBusinessman {
	public static void main(String[] args) {
		
	

	Richman r=new Businessman(); //(we can access only richman method and not businessman method)
r.donation();
r.party();
r.earnMoney();


	Businessman b= new Businessman(); //(we can access all the methods of b,s,r and even person)
	b.happy();
	b.earnMoney();
	b.donation();
	b.helpOthers();
	b.party();
	b.setFirstName("riya");
	b.setLastName("rana");
	System.out.println(b.getFirstName());
	System.out.println(b.getLastName());

	
	
	SocialWorker s= new Businessman();//(we can access only socialworker method and not businessman method)
s.helpOthers();
	}
}
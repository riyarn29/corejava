package in.com.interf;

public class TestBusinessman {
	public static void main(String[] args) {
		
	

	Richman r=new Businessman(); //(we can access only richman method and not businessman method)
r.donation();
r.earnMoney();
r.party();
System.out.println(Richman.a);//(you can also call the variables of abstract class by class name)

	Businessman b= new Businessman(); //(we can access all the methods of b,s,r and even person)
	b.donation();
	b.earnMoney();
	b.happy();
	b.helpOthers();
	b.party();
	b.setFirstName("riyaa");
	b.setLastName("rana");
	System.out.println(b.getfirstName());
	System.out.println(b.getLastName());
	
	SocialWorker s= new Businessman();//(we can access only socialworker method and not businessman method)
s.helpOthers();
	}
}
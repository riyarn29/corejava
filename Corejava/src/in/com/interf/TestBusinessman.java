package in.com.interf;

public class TestBusinessman {
public static void main(String[] args) {
	
	//you cant create richman and sw object coz they are interfaces
	
	//by this method u can call only interface k method
	
	Richman r=new Businessman();
	r.donation();
	r.earnMoney();
	r.party();
	
	SocialWorker s= new Businessman();
		s.helpOthers();
		
		//by this you can call child+parent methods of all interfaces,classes
		Businessman b=new Businessman();
		b.setFirstName("riya");
		b.setLastName("rana");
		b.donation();
		b.earnMoney();
		b.happy();
		b.party();
		b.helpOthers();
}
}

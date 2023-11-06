package in.com.oops;

public class TestAutomobile {
public static void main(String[] args) {
	Automobiles auto=new Automobiles();
	auto.setColour("pinkkkkkkkk");
	auto.setMake("makinggggg");
	auto.setSpeed(140);
	
	System.out.println(auto.getColour());
	System.out.println(auto.getMake());
	System.out.println(auto.getSpeed());
	System.out.println(Automobiles.NO_OF_GEARS);
	
}
}

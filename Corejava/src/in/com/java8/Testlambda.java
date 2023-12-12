package in.com.java8;

public class Testlambda {
public static void main(String[] args) {
	
	
	Hello h=(a,b)->{
		int c=a+b;
		System.out.println("functional interface by lambda expression"+ c);
	};
	h.say(10,20);
}
}

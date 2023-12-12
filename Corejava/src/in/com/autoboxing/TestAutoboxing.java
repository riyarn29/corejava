package in.com.autoboxing;

public class TestAutoboxing {
public static void main(String[] args) {
	
	//new method
	int a=10;
	
	Integer i=a;  //conversion of primitive into wrapper class
	
	int a2=i;      //wrapper to primitive
	
	System.out.println(a2);
	
	
	
	//old method

int b=20;
	   
Integer i1=new Integer(b);
int b2=i1.intValue();
	
	System.out.println();
	
}
}

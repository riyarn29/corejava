package in.com.javacore;

public class StringBufferBasic {
public static void main(String[] args) {
	StringBuffer sb= new StringBuffer ("riya");
	sb.append(" rana");
	System.out.println(sb);
	
	//methods of sb
	//length
	System.out.println("length="+sb.length());
	
	//capacity fixed value is 16
	System.out.println("capacity="+sb.capacity());
	
	//charAt
	System.out.println("charat="+sb.charAt(2));
	
	//index of
	System.out.println("index of="+sb.indexOf("riya"));
	
	//replace
	System.out.println("replace="+sb.replace(0, 3, "wow"));
	
	//reverse
	System.out.println("reverse="+sb.reverse());
	
}
}

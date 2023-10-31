package in.com.javacore;

public class Teststringbuffer {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Riya");
		sb.append(" rana");
		System.out.println("length="+sb.length());
		System.out.println("capacity="+sb.capacity());
		System.out.println("character at="+sb.charAt(3));
		System.out.println("index of="+sb.indexOf("na"));
		System.out.println("replace="+sb.replace(0,3,"wow"));
		System.out.println("Reverse="+sb.reverse());
		
	}

}

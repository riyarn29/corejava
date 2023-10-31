package in.com.javaloops;

public class Stringoperations {
public static void main(String[] args) {
	String name="riyaayayyayyy rana";
	int value=name.length();
	System.out.println(value);
	String lstring=name.toLowerCase();
	System.out.println(lstring);
	String ustring=name.toUpperCase();

	System.out.println
	System.out.println("2nd charater="+name.charAt(1));
	System.out.println("yaay index is="+name.indexOf("yaay"));
	System.out.println("last i position="+name.lastIndexOf("i"));
	System.out.println("first i position="+name.indexOf("i"));
	System.out.println("a replaced by b="+name.replace("a","b"));
	System.out.println("start with riya="+name.startsWith("Riya"));
	System.out.println("ends with ="+name.endsWith("Rana"));
	System.out.println("substring="+name.substring(4));

	
	
}

}

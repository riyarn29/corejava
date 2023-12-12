package in.com.javacore;

public class StringMethods {
	public static void main(String[] args) {
String name="duhitzriyayayyyay";
 
//length- no. of characters in a word
System.out.println("length="+name.length());

//to lower case
System.out.println("lower case="+name.toLowerCase());

//to upper case
System.out.println("upper case="+name.toUpperCase());

//substring- prints no. of char after 10 index no. including 10
System.out.println("substring="+name.substring(10));

//index of
System.out.println("index of z="+name.indexOf('z'));

//replace
System.out.println("replace z with x="+name.replace('z', 'x'));

//charAt
System.out.println("char at 13 index="+name.charAt(13));

//Starts with
System.out.println("starts with="+name.startsWith("duh"));

//ends with
System.out.println("ends with="+name.endsWith("yay"));

}

}
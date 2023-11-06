package in.com.javacore;

public class TestShape {
public static void main(String[] args) {
	
	Shape s1=new Shape();
	
	
	Shape s2=new Shape(55,"red");
	
	s1.setBorderWidth(22);
	s1.setColour("pink");
	System.out.println(s1.getBorderWidth());
	System.out.println(s1.getColour());
	

	
}
}

package in.com.javaarray;

public class ShapeTest {
public static void main(String[] args) {
	
	//through constructor
	Shape s=new Shape();
	Shape s1=new Shape("red");
	Shape s2=new Shape(8,"white");
	Shape s3=new Shape(20);
	
	//through getter setter
	s.setColor("blue");
	s.setBorderWidth(1);
	System.out.println(s.getBorderWidth());
	System.out.println(s.getColor());
}
}

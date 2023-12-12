package in.com.polymorphism;

public class TestShape {
public static void main(String[] args) {
	Shape s[]=new Shape[3];
	s[0]=new Rectangle(10,20);
	s[1]=new Circle(2);
	s[2]=new Triangle(15,12);
	
	//method call hui shape ki but run hui child ki, dynamic and runtime polymorphism
	for(int i=0;i<s.length;i++) {
		s[i].area();
	}
	
}
}

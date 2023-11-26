package in.com.methodoverloading;

public class TestShape {
	public static void main(String[] args) {
		
		Shape s[]=new Shape[3];
		s[0]=new Rectangle(10,10);
		s[1]=new Circle(2.5);
		s[2]=new Triangle(15,10);
		for(int i=0;i<s.length;i++) {
			s[i].area();
	}

}
}
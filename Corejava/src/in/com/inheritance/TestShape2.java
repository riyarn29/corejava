package in.com.inheritance;

public class TestShape2 {
public static void main(String[] args) {
	Shape s[]=new Shape[3];
	s[0]= new Rectangle();
	s[1]=new Circle();
	s[2]=new Triangle();
	
	//typecasting
	Rectangle r=(Rectangle)s[0];
	r.setLength(10);
	r.setWidth(20);
	
	Circle c=(Circle)s[1];
	c.setRadius(2);
	
	Triangle t=(Triangle)s[2];
	t.setBase(12);
	t.setHeight(15);
	
	for(int i=0;i<s.length;i++) {
		s[i].area();
	}
}
}

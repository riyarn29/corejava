package in.com.inheritance;

public class TestShape {
public static void main(String[] args) {
	
	Shape ss =new Shape(); //(method overloading,there are 2 methods of with the same name and diff parameter)
	ss.area();
	ss.area(1);
	
Shape[] s =new Shape[3];

	s[0]=new Rectangle();
	s[1]=new Circle();
	s[2]=new Triangle();
	
	Rectangle r=(Rectangle)s[0];
	r.setLength(10);
	r.setWidth(20);
	
	
	Circle c =(Circle)s[1];
	c.setRadius(4);
	
	Triangle t=(Triangle)s[2];
	t.setBase(15);
	t.setHeight(10);

	for(int i=0;i<s.length;i++) {
		s[i].area();
	}
}}
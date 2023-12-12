package in.com.inheritance;

public class TestShape {
public static void main(String[] args) {
	Shape s=new Shape();
	s.setBorder(1);
	s.setColor("white");
	
	Rectangle r=new Rectangle();
	r.setBorder(2);
	r.setColor("blue");
	r.setLength(24);
	r.setWidth(60);
	
	Circle c=new Circle();
	c.setBorder(3);
	c.setColor("pink");
	c.setRadius(2);
	
	Triangle t=new Triangle();
	t.setBase(12);
	t.setHeight(14);
	t.setBorder(4);
	
	
	t.tArea();
	r.rArea();
	c.cArea();
}
}

package in.com.shape;

public class TestShape1 {
public static void main(String[] args) {
	
	Shape[]s=new Shape[3];
	s[0]=new Rectangle();
	s[1]=new Circle();
	s[2]=new Traingle();
	
	Rectangle r=(Rectangle)s[0];
	r.setLength(10);
	r.setWidth(20);
	
	Circle c=(Circle)s[1];
	c.setRadius(2);
	
	Traingle t=(Traingle)s[2];
	t.setBase(20);
	t.setHeight(10);
	
	for(int i=0;i<s.length;i++) {
		s[i].area();
	}
	
}
}

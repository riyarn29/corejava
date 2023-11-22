package in.com.shape;

public class TestShape {
	public static void main(String[] args){

Shape s=new Shape();
s.setColor("white");
s.setBorderWidth(55);

Rectangle r = new Rectangle();
r.setBorderWidth(4);
r.setColor("blue");
r.setLength(4);
r.setWidth(6);
r.area();

Circle c = new Circle();
c.setBorderWidth(3);
c.setColor("red");
c.setRadius(2);
c.cArea();

Traingle t = new Traingle();
t.setBase(5);
t.setHeight(8);
t.setBorderWidth(88);
t.setColor("yellow");


System.out.println("shape.......");
System.out.println(s.getColor());
System.out.println(s.getBorderWidth());

System.out.println("rectangle.....");
System.out.println(r.getBorderWidth());
System.out.println(r.getColor());
System.out.println(r.getLength());
System.out.println(r.getWidth());

System.out.println("circle.....");
System.out.println(c.getBorderWidth());
System.out.println(c.getColor());
System.out.println(c.getRadius());

System.out.println("triangle....");
System.out.println(t.getBase());
System.out.println(t.getBorderWidth());
System.out.println(t.getColor());
System.out.println(t.getHeight());
	}

}
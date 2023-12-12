package in.com.polymorphism;

public class Circle extends Shape{
private int radius;
public Circle(int radius) {
	this.radius=radius;
	System.out.println(radius);
}
public void area() {
	double area= 3.14*(radius*radius);
	System.out.println("circle area="+area);
}
}

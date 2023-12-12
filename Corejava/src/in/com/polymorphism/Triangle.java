package in.com.polymorphism;

public class Triangle extends Shape {
private int base;
private int height;

public Triangle(int base,int height) {
	this.height=height;
	this.base=base;
	System.out.println(height);
	System.out.println(base);
}
public void area() {
	int area=base*height/2;
	System.out.println("triangle area="+area);
}
}

package in.com.polymorphism;

public class Rectangle extends Shape{
private int length;
private int width;

public Rectangle(int length,int width) {
	this.length=length;
	this.width=width;
	System.out.println(length);
	System.out.println(width);
	
}
public void area() {
	int area=length*width;
	System.out.println("rectangle area="+area);
}
}

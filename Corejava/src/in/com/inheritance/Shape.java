package in.com.inheritance;

public class Shape {
private String color;
private int borderwidth;
public int getBorderwidth() {
	return borderwidth;
}
public void setBorderwidth(int borderwidth) {
	this.borderwidth = borderwidth;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public void area() {
	System.out.println("shape area method");
}
public void area(int a) {
	System.out.println("shape area method 2");
}
}

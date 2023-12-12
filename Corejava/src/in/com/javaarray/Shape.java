package in.com.javaarray;

public class Shape {
private String color;
private int borderWidth;

public Shape() {
	System.out.println("default constructor");
}
public Shape(String color) {
	this.color=color;
	System.out.println(color);
}
public Shape(int borderWidth) {
	this.borderWidth=borderWidth;
	System.out.println(borderWidth);
}
public Shape(int borderWidth,String color) {
	this.borderWidth=borderWidth;
	this.color=color;
	System.out.println(borderWidth);
	System.out.println(color);
}
public void setBorderWidth(int borderWidth) {
	this.borderWidth = borderWidth;
}
public int getBorderWidth() {
	return borderWidth;
}
public void setColor(String color) {
	this.color = color;
}
public String getColor() {
	return color;
}

}

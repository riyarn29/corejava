package in.com.polymorphism;

public class Shape {
private int border;
private String color;

public int getBorder() {
	return border;
}
public void setBorder(int border) {
	this.border = border;
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
}

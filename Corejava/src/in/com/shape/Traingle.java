package in.com.shape;

public class Traingle extends Shape{

private int base;
private int height;

public void setHeight(int height) {
	this.height = height;
}
public int getHeight() {
	return height;
}
public void setBase(int base) {
	this.base = base;
}
public int getBase() {
	return base;
}
public void tArea() {
	int tArea=getBase()*getHeight()/2;
	System.out.println("triangle area="+tArea);
}
}

package in.com.methodoverloading;

public class Rectangle extends Shape{
	
private int length;
private int width;

public Rectangle(int length,int width) {
	this.length=length;
	this.width=width;
	//System.out.println("length="+length);
	//System.out.println("width="+width);
	
	
}
public void  area(){
	int area=this.length*this.width;
	System.out.println("rectangle area="+area);
}
}

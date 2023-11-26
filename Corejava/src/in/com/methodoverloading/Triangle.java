package in.com.methodoverloading;

public class Triangle extends Shape {

	private int base;
	private int height;
	
	public Triangle(int base,int height) {
		this.base=base;
		this.height=height;
		//System.out.println("base="+base);
	//	System.out.println("height="+height);
	}
	public void area() {
		int area=this.base*this.height/2;
		System.out.println("triangle area="+area);
	}
}

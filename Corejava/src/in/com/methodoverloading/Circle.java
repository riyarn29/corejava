package in.com.methodoverloading;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
		//System.out.println("radius="+radius);
		
	}
	public void area() {
		double area=3.14*(this.radius*this.radius);
		System.out.println("circle area ="+area);
	}
}

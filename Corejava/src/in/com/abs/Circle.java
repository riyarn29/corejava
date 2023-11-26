package in.com.abs;

public class Circle extends Shape {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
	private int radius;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void Carea() {
		double area=3.14
				*(getRadius()*getRadius());
		System.out.println("circle area ="+area);
	}
	

}

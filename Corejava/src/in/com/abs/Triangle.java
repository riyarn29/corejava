package in.com.abs;

public class Triangle extends Shape {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
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
	public void Tarea() {
		int area=getBase()*getHeight()/2;
		System.out.println("triangle area="+area);
	}

}
package in.com.javacore;

public class Shape {

private String colour;
private int borderWidth;

public Shape() {
	System.out.println("DEFAULT CONSTRUCTOR");
}
	public Shape(int borderWidth,String colour) {
		this.borderWidth=borderWidth;
		this.colour=colour;
		System.out.println(colour);
		System.out.println(borderWidth);
}
	
	
	public void setColour(String colour) {
		this.colour= colour;
	}
	public String getColour() {
		return colour;
		
	}
	
	public void setBorderWidth(int BW) {
		borderWidth=BW;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
}

package in.com.abs;

public class TestShape {
	public static void main(String[] args) {
	
		//(you can call abstract or non abstract method of parent using child like given below ,
		//in this way we can use child as well as parent class k methods) 
		
		Rectangle r=new Rectangle();
		r.area();
		r.Rarea();
		r.shape();
		
		//(Here we are holding child class in parent class so we can only call parent class methods both
		//abstract and non abstract)
		Shape s=new Circle();
		s.area();
		s.shape();
		
		//(or you can make the non abstract method static and call the method using class name like give below)
	Shape.sum();
		
	}}
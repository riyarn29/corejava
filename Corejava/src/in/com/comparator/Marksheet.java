package in.com.comparator;

import java.util.Comparator;

public class Marksheet{
	public int id;
	public String name;
	public int marks;

	public Marksheet(int id,String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	@Override
		public String toString() {
			return id +" "+ name+" "+marks;
		}
}
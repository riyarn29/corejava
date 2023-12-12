package in.com.comparable;

public class Marksheet implements Comparable<Marksheet> {
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
@Override
public int compareTo(Marksheet o) {
if(this.id-o.id==0){
	return o.marks-this.marks;
}
return this.id-o.id;
}
}

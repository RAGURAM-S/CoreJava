class Student{
	int roll;
	String name;
	double marks;
	
	Student(int roll, String name, double marks){
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
}

class MyRecord extends Student{
	MyRecord(int roll, String name, double marks){
	
		super(roll, name, marks);
	}
	
	void display() {
		
		System.out.println(roll + " " + name + " " + marks);
	}
		
	}

	
public class Record {
	
	public static void main(String[] args) {
		
		MyRecord m = new MyRecord(123, "Ragu", 80.2);
		m.display();
	
	}

}

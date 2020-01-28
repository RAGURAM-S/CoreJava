package pack;

class Student1{
	
	int roll_no;
	String name;
	
	Student1(int roll_no, String name){
		
		this.roll_no = roll_no;
		this.name = name;
	}
	
}

class Record1 extends Student1{
	
	int roll_no;
	String name;
	String address;
	
	Record1(int roll_no, String name, String address){
		
		super(roll_no, name);
		this.roll_no = roll_no;
		this.name = name;
		this.address = address;
	}
	
	void displayRecords() {
		System.out.println(roll_no);
		System.out.println(name);
		System.out.println(address);
	}
	
}

public class Assignment2 {
	
	public static void main(String[] args) {
		
		Record1 rec = new Record1(123, "Bruce Wayne", "Gotham city");
		rec.displayRecords();
	}
}

package exceptions;

class LowMarksException extends Exception{
	
	LowMarksException(int a){
		System.out.println(a);
	}
	
}

class StudentMarks{
	
	int marks;
	
	StudentMarks(int marks){
		this.marks = marks;
	}
	
	void checkMarks() throws LowMarksException {
		
		if (this.marks < 15) {
			
			throw new LowMarksException(this.marks);
			
		}
		
		else {
			
			System.out.println("Marks :"+ " "+this.marks);
		}
	}
}

public class Assignment{
	
	public static void main(String[] args) throws LowMarksException {
		
		StudentMarks st = new StudentMarks(16);
		StudentMarks st1 = new StudentMarks(10);
		
		st.checkMarks();
		st1.checkMarks();
		
	}
}
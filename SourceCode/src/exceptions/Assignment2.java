package exceptions;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class AgeNotWithinRangeException extends Exception{
	
	AgeNotWithinRangeException(int age){
		System.out.println("Invalid age" + age);
	}
}

class NameNotValidException extends Exception{
	
	NameNotValidException(String name){
		System.out.println("Invalid Name : " + name);
	}
}

class Student{
	int roll_no;
	String name;
	int age;
	
	Student(int roll_no, String name, int age){
		
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
	}
	
	void checkAge() throws AgeNotWithinRangeException {
		
		if(this.age >= 15 && this.age <= 21) {
			System.out.println("Valid Age");
		}
		
		else {
			
			throw new AgeNotWithinRangeException(this.age);
		}
	}
	
	void checkName() throws NameNotValidException{
		
		Pattern p = Pattern.compile("[^A-Za-z]");
		Matcher m = p.matcher(this.name);
		boolean b = m.find();
		if(b == true) {
			throw new NameNotValidException(this.name);
		}
		
		else {
			System.out.println("Valid name " + this.name);
		}
	}
	
	
}

public class Assignment2 {
	
	public static void main(String[] args) throws AgeNotWithinRangeException, NameNotValidException {
		
		Student s1 = new Student(123, "Bruce Wayne", 155);
		s1.checkAge();
		s1.checkName();
		
	}
}

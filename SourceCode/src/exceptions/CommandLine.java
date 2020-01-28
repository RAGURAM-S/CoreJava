package exceptions;

class ValidAgeException extends Exception{
	
	ValidAgeException(int age){
		
		System.out.println("The arguments passed are not valid..!");
	}
}

public class CommandLine {

	public static void main(String[] args) throws ValidAgeException {
		
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		if(age >= 18 && age < 60) {
			System.out.println("The arguments passed are valid");
		}
		
		else {
			
			throw new ValidAgeException(age);
		}
		
	}
}

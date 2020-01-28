package exceptions;

class InvalidCountryException extends Exception{
	
	InvalidCountryException(String country){
		
		System.out.println("User outside India cannot be registered..!");
	}
}

class UserRegistration{
	
	String name;
	String country;
	
	void registerUser(String name, String country) throws InvalidCountryException {
		
		this.name = name;
		this.country = country;
		
		if(this.country != "india") {
			
			throw new InvalidCountryException(this.country);
		}
		
		else {
			
			System.out.println("User registration successful..!");
		}
	
	}
}
public class Country {

	public static void main(String[] args) throws InvalidCountryException {
		
		UserRegistration u1 = new UserRegistration();
		u1.registerUser("sherlock", "uk");
	}
}

class Contact{
	
	String contactPerson;
	int mobile;
	String email;
	
	Contact(String contactPerson, int mobile, String email){
		this.contactPerson = contactPerson;
		this.mobile = mobile;
		this.email = email;
	}
	
	void printDetails() {
		System.out.println(contactPerson + " " + mobile + email);
	}
}

class CompanyContact extends Contact{
	
	String contactPerson;
	int mobile;
	String email;
	String companyName;
	String website;
	String department;
	String city;
	String country;
	String address;
	int pin;
	
	CompanyContact(String contactPerson, int mobile, String email, String companyName, String website, String department, String city, String country, String address, int pin){
		
		super(contactPerson, mobile, email);
		this.contactPerson = contactPerson;
		this.mobile = mobile;
		this.email = email;
		this.companyName = companyName;
		this.website = website;
		this.department = department;
		this.city = city;
		this.country = country;
		this.address = address;
		this.pin = pin;
	}
	
	void printDetails() {
		
		System.out.println("Company Contact");
		System.out.println(companyName + " " + website + " " + department + " " + city + " " + country + " " + address + " " + pin );
	}
}

class EmployeeContact extends Contact{
	
	String contactPerson;
	int mobile;
	String email;
	String city;
	String country;
	int pin;
	String designation;
	String dob;
	
	EmployeeContact(String contactPerson, int mobile, String email, String city, String country, int pin, String designation, String dob){
		
		super(contactPerson, mobile, email);
		this.contactPerson = contactPerson;
		this.mobile = mobile;
		this.email = email;
		this.city = city;
		this.country = country;
		this.pin = pin;
		this.designation = designation;
		this.dob = dob;
	}
	
	void printDetails() {
		
		System.out.println("Employee Contact");
		System.out.println(city + " " + country + " " + pin + " " + designation + " " + dob);
	}
}

public class Contacts {
	
	public static void main(String[] args) {
		
		CompanyContact cc = new CompanyContact("Tony", 1234567890, "tony@mail.com", "jda", "wwww.jda.com", "cs", "blre", "india", "bellandur", 654321);
		EmployeeContact ec = new EmployeeContact("Tony", 1234567890, "tony@mail.com", "blre", "india", 654321, "technical consultant", "March-98");
		cc.printDetails();
		ec.printDetails();
		
	}
}

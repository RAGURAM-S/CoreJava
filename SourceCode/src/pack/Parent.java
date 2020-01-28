package pack;

class Parents {
	
	int property;
	String spouse;
	
	public void setProperty(){
		property = 1000000;
		System.out.println("Property : "+property);
	}
	
	public void setMarriage() {
		spouse = "ABC";
		System.out.println("Spouse : " + spouse);
	}
	
}

class Child extends Parents{
	
	int property;
	
	public void setProperty(){
		property = 10000;
		System.out.println("Property : " + property);
	}
}

public class Parent{
	public static void main(String[] args) {
		Child c = new Child();
		c.setProperty();
		c.setMarriage();
	}
}

package pack;

class Base{
	
	int number_1;
	int number_2;
	
	Base(int number_1, int number_2){
		
		this.number_1 = number_1;
		this.number_2 = number_2;
	}
}

class Derived extends Base{
	
	int number_1;
	int number_2;
	
	Derived(int number_1, int number_2){
		
		super(number_1, number_2);
		this.number_1 = number_1;
		this.number_2 = number_2;
		
	}
	
	void findMaximum() {
		
		if(this.number_1 > this.number_2) {
			System.out.println(this.number_1 + " is greater");
		}
		
		else {
			System.out.println(this.number_2 + " is greater");
		}
	}
	
}

public class Assignment3 {
	
	public static void main(String[] args) {
		
		Derived d1 = new Derived(5, 6);
		d1.findMaximum();

	}
}

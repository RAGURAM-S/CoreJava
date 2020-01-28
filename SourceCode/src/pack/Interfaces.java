package pack;

interface I{
	
	void printable();
}

interface J{
	
	void printable();
}


public class Interfaces implements I, J{

	public void printable() {
		
		System.out.println("Bruce Wayne");
	}
	
	public static void main(String[] args) {
		
		Interfaces interfaces = new Interfaces();
		interfaces.printable();
		
	}
}

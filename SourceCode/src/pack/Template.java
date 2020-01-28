package pack;

class Tester<S, T>{
	
	S object1;
	T object2;
	
	Tester(S object1, T object2){
		
		this.object1 = object1;
		this.object2 = object2;
	}
	
	void displayContents() {
		
		System.out.println(object1);
		System.out.println(object2);
	}
	
}

public class Template {
	
	public static void main(String[] args) {
		
	Tester<Integer, String> ob = new Tester<Integer, String>(15, "16");
	ob.displayContents();
	
	}
}

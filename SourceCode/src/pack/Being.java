package pack;

class Human{
	
	String name;
	String gender;
	
	Human(String name, String gender){
		
		this.name = name;
		this.gender = gender;
	}
	
	static void findElder(Man m, Woman w) {
		
		int m_age = m.age;
		String m_name = m.name;
		int w_age = w.age;
		String w_name = w.name;
		if(m_age > w_age) {
			System.out.println(m_name + " is elder");
		}
		else {
			System.out.println(w_name + "is elder");
		}
	}
	
}

class Man extends Human{
	
	String name;
	int age;
	static String gender = "Male";
	Man(String name, int age){
		super(name, gender);
		this.name = name;
		this.age = age;
	}
	
}

class Woman extends Human{
	
	String name;
	int age;
	static String gender = "Female";
	Woman(String name, int age){
		super(name, gender);
		this.name = name;
		this.age = age;
	}
	
}

public class Being {
	
	public static void main(String[] args) {
		
		Man m = new Man("Stark", 24);
		Woman w = new Woman("Pepper", 21);
		Human.findElder(m, w);
	}

	

}

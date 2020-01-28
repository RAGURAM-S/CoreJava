package pack;

class Rectangle{
	
	int length;
	int breadth;
	int area;
	
	Rectangle(int length, int breadth){
		
		this.length = length;
		this.breadth = breadth;
	}
	
	void findArea() {
		
		area = this.length*this.breadth;
		System.out.println(area);
	}
}

class Box extends Rectangle{
	
	int length;
	int breadth;
	int depth;
	
	Box(int length, int breadth, int depth){
		
		super(length, breadth);
		this.length = length;
		this.breadth = breadth;
		this.depth = depth;
	}
	

	
}

public class Volume {
	
	public static void main(String[] args) {
		
		Box b1 = new Box(2, 4, 5);
		
	}
}

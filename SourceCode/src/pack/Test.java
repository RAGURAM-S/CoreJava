package pack;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		if (num % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		in.close();
	}

}

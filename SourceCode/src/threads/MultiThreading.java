package threads;

import java.util.Scanner;

public class MultiThreading {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int iter = scanner.nextInt();
		for(int i = 0; i < iter; i++) {
			Demo object = new Demo();
			object.start();
		}
		scanner.close();
	}
}

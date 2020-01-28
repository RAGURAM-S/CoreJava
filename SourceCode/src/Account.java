import java.util.Scanner;

public class Account {
	int account;
	String name;
	float balance;
	void insertRecords(int a, String n, float amt) {
		account = a;
		name = n;
		balance = amt;
	}
	void displayRecords() {
		System.out.println("Account No. :" + account);
		System.out.println("Name :" + name);
		System.out.println("Balance :" + balance);
	}
	void deposit(float amt) {
		balance = balance + amt;
		System.out.println("A sum of Rs." + amt + "has been deposited");
	}
	void withdraw(float amt) {
		if (balance < amt) {
			System.out.println("Insufficient funds");
		}
		else {
			balance = balance - amt;
			System.out.println("A sum of Rs." + amt + "has been withdrawn");
		}
	}
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Account a = new Account();
		int ac = obj.nextInt();
		String nam = obj.next();
		float amount = obj.nextFloat();
		a.insertRecords(ac, nam, amount);
		a.displayRecords();
		float dep = obj.nextFloat();
		a.deposit(dep);
		a.displayRecords();
		float withdrawl = obj.nextFloat();
		a.withdraw(withdrawl);
		a.displayRecords();
		obj.close();
		
	}
}

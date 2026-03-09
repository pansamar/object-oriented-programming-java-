package week4_ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		SavingsAccount sa1 = new SavingsAccount(1500, 0.02);
		System.out.println("The balance of SA1 is: " + sa1.getBalance() + " euros");

		CheckingAccount ca1 = new CheckingAccount(2000);
		ca1.deposit(500);
		ca1.deposit(500);
		ca1.deposit(500);
		ca1.deposit(500);
		System.out.println("The balance of CA1 is: " + ca1.getBalance() + " euros");

		/* Χρήση toString πριν τη δημιουργία της μεθόδου στη κλάση BankAccount
		System.out.println(sa1.toString()); //Εναλλακτκός τρόπος: System.out.println(sa1);
		*/
		
		//Επικάλυψη της μεθόδου toString
		System.out.println(sa1.toString());
		
		BankAccount ba;
		
		ba = new BankAccount(1200);
		ba.printData();
		
		
		ba = new SavingsAccount(1200, 0.02);
		ba.printData();
		
		Scanner in = new Scanner(System.in);
		int answer;
		double amount;
		
		System.out.println("Give amount");
		amount = in.nextDouble();
		System.out.println("Type of account? 1: Normal, 2: Savings, 3: Checking");
		answer = in.nextInt();
		
		if(answer == 1) {
			ba = new BankAccount(amount);
		}
		else if(answer == 2) {
			ba = new SavingsAccount(amount, 0.02);
			ba.deposit(300);
			ba.deposit(300);
			ba.deposit(300);
			ba.deposit(300);
		}
		else if(answer == 3) {
			ba = new CheckingAccount(amount);
		}
		
		//Δυναμική ή καθυστερημένη διασύνδεση
		//Πολυμορφική κλήση
		ba.printData(); 
		
		BankAccount ba1 = new BankAccount(1000);
		SavingsAccount sa2 = new SavingsAccount(1100,0.03);
		CheckingAccount ca2 = new CheckingAccount(900);
		
		Bank bank = new Bank();
		bank.addAccount(ba1);
		bank.addAccount(sa2);
		bank.addAccount(ca2);
		
		bank.addAccount(ba);
		bank.addAccount(sa1);
		bank.addAccount(ca1);
		
		bank.printAllData();
	}

}
 
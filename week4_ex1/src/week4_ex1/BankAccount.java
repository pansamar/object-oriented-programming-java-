package week4_ex1;

public class BankAccount {

	protected double balance;
	
	public BankAccount(double amount) {
		balance = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public String toString() {
		return ("Balance: " + balance); 
	}
	public void printData() {
		System.out.print("Normal bank account, ");
		System.out.println("balance: " + balance);
	}
}

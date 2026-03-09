package week4_ex1;

public class SavingsAccount extends BankAccount{

	private double interest_rate;
	
	public SavingsAccount(double balance, double rate) {
		super(balance); 
		interest_rate = rate; 
	}
	public void setInterest_rate(double rate) {
		interest_rate = rate;
	}
	public void addInterest() {
		double interest = balance * interest_rate;	//Εναλλακτικός τρόπος: double interest = balance * interest_rate;
		balance += interest;
	} 
	public void printData() {
		System.out.print("Savings account, ");
		System.out.println("balance: " + balance + " rate " + interest_rate);
		 
	}
} 

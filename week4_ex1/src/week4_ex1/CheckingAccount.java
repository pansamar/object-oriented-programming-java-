package week4_ex1;

public class CheckingAccount extends BankAccount{

	private int transactionsCountered;
	
	public CheckingAccount(double amount) {
		super(amount);
		transactionsCountered = 0;
	}
	
	//Επαναορισμός-επικάλυψη μεθόδου (overwrite)
	public void deposit(double amount){
		transactionsCountered++;
		super.deposit(amount); //Εναλλακτικός τρόπος: balance += amount;
		
		if(transactionsCountered > 3)
			deductFees();
	}
	public void deductFees() {
		balance -= 0.5;
	}
	public void printData() {
		System.out.print("Checking account, ");
		System.out.println("balance: " + balance + " with free limit: 3 transactions");
	}
	
}

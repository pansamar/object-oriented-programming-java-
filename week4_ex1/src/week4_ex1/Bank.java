package week4_ex1;

import java.util.ArrayList;

public class Bank {
	private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	
	public void addAccount(BankAccount anAccount) {
		accounts.add(anAccount);
	}
	public void printAllData() {
		for(BankAccount a: accounts) {
			a.printData();
		}
	}
}

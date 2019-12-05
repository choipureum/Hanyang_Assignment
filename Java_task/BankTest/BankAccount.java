package BankTest;

import javax.swing.JOptionPane;

public class BankAccount {
	public String account_name; 
	private int balance; 
	public BankAccount(String name, int initial_balance) {
		account_name = name; 
		if (initial_balance < 0)
			balance = 0; 
		else 
			balance = initial_balance; 
	}
	public int getBalance() {
		return balance; 
	}
	
	public boolean deposit(int amount) {
		// 입금 
		if (amount < 0) {
			JOptionPane.showMessageDialog(null, "잘못된 입금 금액.");
			return false; 
		}
		else {
			balance = balance + amount;
			return true;
		}
	}
	
	public boolean withdraw(int amount) {
		// 출금 
		if ((amount < 0) || (amount > balance)) {
			JOptionPane.showMessageDialog(null, "잘못된 출금 금액.");
			return false;
		}
		else {
			balance = balance - amount;
			return true;
		}
	}
}

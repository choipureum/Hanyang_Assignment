package BankTest;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class BankWriter {
	private BankAccount bank;
	private String last_transaction; 
	
	public BankWriter(BankAccount b) {
		bank = b; 
	}
	private String cent2dollar(int amount) {
		String answer; 
		answer = new DecimalFormat("0.00").format(amount / 100.0);
		return answer; 
	}
	
	public void showTransaction(String message, int amount) {
		last_transaction = message + " 금액 : " + cent2dollar(amount); 
		System.out.println(bank.account_name + " " + last_transaction);
		System.out.println("현재 금액은 " + cent2dollar(bank.getBalance()));
	}
	
	public void showTransaction(String message) {
		last_transaction = message; 
		System.out.println(last_transaction);
	}
}

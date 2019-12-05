package BankTest;

public class AccountManager2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankReader r = new BankReader();
		BankAccount p = new BankAccount("primary", 0);
		BankAccount s = new BankAccount("secondary", 0);
		BankWriter pw = new BankWriter(p);
		BankWriter sw = new BankWriter(s);
		
		AccountController2 controller = new AccountController2(r, p, pw, s, sw);
		controller.processTransaction();
	}

}

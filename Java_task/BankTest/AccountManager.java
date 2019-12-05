package BankTest;

public class AccountManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankReader r = new BankReader();
		BankAccount a = new BankAccount("myaccount", 0);
		BankWriter w = new BankWriter(a);
		
		AccountController controller = new AccountController(r, w, a);
		controller.processTransaction();
	}

}

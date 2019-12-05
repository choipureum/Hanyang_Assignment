package BankTest;

public class AccountController {
	private BankReader reader; 
	private BankWriter writer; 
	private BankAccount account; 
	
	public AccountController(BankReader r, BankWriter w, BankAccount a) {
		reader = r; 
		writer = w;
		account = a; 
	}
	public void processTransaction() {
		char command = reader.readCommand("명령 D/W/Q 입력. ");
		int amount;
		boolean ok;
		
		switch (command) {
		case 'D':
			amount = reader.readAmount();
			ok = account.deposit(amount);
			if (ok) {
				writer.showTransaction("입금 완료", amount);
			}
			else {
				writer.showTransaction("입금 금액 에러.");
			}
			break; 
		case 'W':
			amount = reader.readAmount();
			ok = account.withdraw(amount);
			if (ok) {
				writer.showTransaction("출금 완료", amount);
			}
			else {
				writer.showTransaction("출금 금액 에러.");
			}
			break; 
		case 'Q':
			return; 
		default: 
			writer.showTransaction("잘못된 명령어입니다.");
		}
		
		this.processTransaction();
	}
}

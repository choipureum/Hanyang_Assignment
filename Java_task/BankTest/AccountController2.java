package BankTest;

public class AccountController2 {
	private BankReader reader; 
	private BankWriter writer, primary_writer, secondary_writer; 
	private BankAccount account, primary, secondary; 
	
	public AccountController2(BankReader r, BankAccount p, BankWriter pw, BankAccount s, BankWriter sw) {
		reader = r;
		primary = p;
		secondary = s; 
		primary_writer = pw; 
		secondary_writer = sw; 
		
		account = p;
		writer = pw;
	}
	public void processTransaction() {
		char command = reader.readCommand("명령 P/S/D/W/Q 입력. ");
		int amount;
		boolean ok;
		
		switch (command) {
		case 'P':
			writer.showTransaction("비활성화");
			account = primary; 
			writer = primary_writer; 
			writer.showTransaction("활성화");
			break;
		case 'S':
			writer.showTransaction("비활성화");
			account = secondary; 
			writer = secondary_writer; 
			writer.showTransaction("활성화");
			break;
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

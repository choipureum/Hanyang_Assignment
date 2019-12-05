package BankTest;

import javax.swing.JOptionPane;

public class BankReader {
	private String input_line; 
	public char readCommand(String message) {
		// message "명령 D/W/Q 입력" 
		input_line = JOptionPane.showInputDialog(message);
		if (input_line == null) {
			return 'Q';
		}
		input_line = input_line.toUpperCase();
		// "  D   10.2    "
		input_line = input_line.trim();
		// "D   10.2"
		return input_line.charAt(0);
	}
	
	public int readAmount() {
		// input_line = "D   10.2"
		if (input_line.length() < 1) {
			JOptionPane.showMessageDialog(null, "잘못된 금액");
			return 0; 
		}
		else 
		{
			String s = input_line.substring(1, input_line.length());
			// s = "   10.2"
			double dollars = Double.parseDouble(s); // s = "10.2"
			return (int)(dollars * 100.0);
		}
	}
}

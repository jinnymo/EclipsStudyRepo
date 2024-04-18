package basic.ch12;

public class User {

	static String bankName;
	int balance;
	
	
	public User(int balance) {
		this.balance = balance;
		bankName = "우리";
	}
	public String getBankName() {
		return this.bankName;
	}
	public int getBalace() {
		return this.balance;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

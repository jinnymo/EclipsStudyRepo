package basic.ch23;

public class Father extends Thread {

	BankAccount account;
	// 위임 시킬일을 정의 할 예정

	public Father(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		//1만 입금 처리- 다른 작업자에게 위임함
		account.saveMoney(10_000);
	}
}

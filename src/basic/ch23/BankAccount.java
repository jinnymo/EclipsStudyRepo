package basic.ch23;

public class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 입금
	public void saveMoney(int money) {

		

		// 시간이 걸림....
		synchronized (this) {
			int currentMoney = getMoney();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			setMoney(currentMoney + money);

			System.out.println("입금후 계좌 잔액 : " + getMoney());

		}

	}

	// 출금
	public synchronized int withDraw(int money) {

		int currentMoney = getMoney();

		// ...출금 0.5초 정도 걸림
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (currentMoney >= money) {
			setMoney(currentMoney - money);
			System.out.println("출금후 계좌 잔액 : " + getMoney());
			return money;
		} else {
			System.out.println("계좌 잔액이 부족합니다.");
			return 0;
		}
	}

}

package basic.ch10;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank1 = new Bank();
		// bank1.name = "우리은행";

		bank1.deposit(10_000);
		int getMoney = bank1.withdraw(5_000);
		System.out.println("금액 : " + getMoney);
		System.out.println(">>>>>>>>>>출금>>>>>>>>>>>>");
		bank1.showInfo();
		// 신입이 실수로 멤버변수에 접근해서 수정....
		// bank에 돈을 넣어야 ---> deposit()기능으로 만들어져있다.
		//bank1.balance = 100_000;
		bank1.deposit(100_000);
		bank1.showInfo();
		// 10만5천이 있어야 정상
		// 의도 하지 않은 실수를 발생 시킬수 있다.
	
		//실행의 흐름 만들 예ㅓㅇ
		//현제 은행에 전체 잔고가 200_000원 이하라면 본점에 금액 요청 사항
		System.out.println(bank1.getBalance());
		int money = bank1.getBalance();
		if(money <= 200_000) {
			System.out.println("본점에 금액을 요청해");
		}
		bank1.setName("그린은행");
		System.out.println(bank1.getName());
		bank1.setBalance(1_000_000);
		System.out.println(bank1.getBalance());
	}

}

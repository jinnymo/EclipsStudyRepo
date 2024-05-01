package basic.ch23;

public class MainTest {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();

		// 아버지 클래스 new
		// 생성자 의존 주입(DI)
		Father father = new Father(account);
		father.start();
		// 어머니 클래스 new
		
		account.withDraw(5000);
		
		//Mother mother = new Mother(account);
		//	mother.start();
		
		int resultMoney = account.getMoney();
		System.out.println(resultMoney);
	}
}

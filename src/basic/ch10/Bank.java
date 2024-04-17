package basic.ch10;

//은행
public class Bank {
	
	//접근제어지시자 - 아무것도 지정하지 않으면 default제어지시자(같은 패키지 내에서만 접근가능)
	
	//private은 class 파일 안에서만 사용가능
	private String name;
	private int balance; //정보은닉 private ->> 외부에서 접근불가하게 만든다.
	
	//입금하다.
	public void deposit(int money) {
		balance += money;
		showInfo();
	}
	//출금하다.
	public int withdraw(int money) {
		//방어적 코드를 작성
		if(balance <money) {
			System.out.println("잘못된 요청입니다.");
			return 0;
		}
		
		balance -= money;
		
		return money;
	}
	//현재 은행의 총 잔액을 출력하다.
	public void showInfo() {
		System.out.println("현재 잔액은 : "+this.balance +"입니다.");
	}
	
	
	//정보 은닉후에 getter, setter 메서드를 설계 해둘수 있다.
	//get 메서드란 단순히 객체의 상태 변수를 리턴하는 메서드 이다.
	public int getBalance() {
		return this.balance;
	}
	public String getName() {
		return this.name;
	}
	// setter 멤버변수에 접근해서 객체의 상태 값을 변경하게 하는 메서드(리턴타입이 없음)
	
	public void setName(String inputName) {
		this.name = inputName;
	}
	public void setBalance(int inputMoney) {
		//방어적 코드 작성하기
		if(inputMoney <= 0 ) {
			System.out.println("잘못된 입력");
		}else {
			this.balance = inputMoney;
		}
		
	}
	
	
	
	
	
}

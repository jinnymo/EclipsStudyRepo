package useful.ch04;

public abstract class Car {

	void startCar() {
		System.out.println("시동을 킵니다.");
	}
	abstract void drive();
	
	abstract void stop();
	
	void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//템플릿 메서드 패턴에 핵심!!
	//메서드에 앞에 final 키워드를 사용한다면 : 하위클래스에서
	//재정의를 할 수 없다.
	final void run() {
		//실행의 흐름 만들어보기
		startCar();
		drive();
		stop();
		turnOff();
	}
	
	
	
}

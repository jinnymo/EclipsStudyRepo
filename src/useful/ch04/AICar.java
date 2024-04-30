package useful.ch04;

public class AICar extends Car {

	@Override
	void drive() {
		System.out.println("ai차가 자율주행을 합니다.");

	}

	@Override
	void stop() {
		System.out.println("ai차가 자율주행을 종료합니다.");

	}
}

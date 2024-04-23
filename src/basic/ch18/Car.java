package basic.ch18;

public class Car {

	String name;
	int price;
	Engine engine;// 포함관계 || composition 관계
	
	public Car() {
		
		//객체안에 필요 객체를 직접 생성할경우
		engine = new Engine();
		//car라는 객체가 생성될떄 engine 객체 함께 생성
		//이는 composition 관계 특성 이해 필요
		//개념은 "has-a" 관계로도 알려져 있으며, 객체 간의 강한 연관성을 나타냅니다
	}
	
	public void startCar() {
		engine.start();
		System.out.println("자동차가 출발합니다.");
		
	}
	public void stopCar() {
		engine.stop();
		System.out.println("자동차가 멈춥니다.");
	}
}

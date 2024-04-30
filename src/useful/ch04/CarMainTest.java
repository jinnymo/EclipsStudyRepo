package useful.ch04;

public class CarMainTest {
	

	public static void main(String[] args) {
		Car aicar = new AICar();// 다형성, 업캐스팅된 상태
		aicar.run();
	}
	
}

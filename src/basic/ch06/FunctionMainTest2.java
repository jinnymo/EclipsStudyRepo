package basic.ch06;

public class FunctionMainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//함수를 언제든지 호출해서 사용할수있다.
		System.out.println( addNum(10, 10, 10));
		
		sayHello("safd");
		
		System.out.println(calcSum());
		
		
		
		
		
	}

	// 함수 설계, 함수 사용

	// 세개의 정수값을 받아서 덧셈 하는 기능을 만들어 보자.

	static int addNum(int n1, int n2, int n3) {
		int result = 0;
		result = n1 + n2 + n3;
		return result;
	}
	
	//리턴값이 없는 함수 만들어 보자
	static void sayHello(String greeting) {
		System.out.println(greeting + "^^");
	}
	
	//매개변수가 없는 함수를 만들어 보자. 리턴값도 없다.
	static int calcSum() {
		
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {//횟수 100번 동작하는 녀석
			// 0 = 0 + 1
			// 1 = 1 + 2
			// 3 = 3 + 3
			sum += i; //5050
		}
		return sum;
		
	}
}

package basic.ch03;

/*
 * 논리 연산자
 * 관계 연산자와 혼합하여 많이 사용 된다.
 * 연산에 결과는 ture, false 로 반환된다
 */
public class Operation6 {

	public static void main(String[] args) {

		// 논리 연산자는 3가지 종류가 있다.
		// 논리곱 ---> && (엠퍼센트,엠퍼센트)
		// 논리합 ---> ||(버티컬바,버티컬바)
		// 부정 ---> !

		int num1 = 10;
		int num2 = 20;

		// 1. 논리곱(&&)
		// T T && T
		// 논리곱은 전부 true 이면 true 반환한다. 하나라도 거짓이면 false를 반환한다.
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println("flag 1 : " + flag1);

		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println("flag 2 : " + flag2);

		System.out.println("------------------------------");

		// 2. 논리합
		//둘중에 하나라도 true 이면 연산에 결과는 무조건 true 이다.
		boolean flag3 = (num1 > 0) || (num2 < 0);
		System.out.println("flag 3 : " + flag3);

		
		boolean flag4 = !(num1 < 0);
		System.out.println("flag 4 : " +  flag4);
		System.out.println("부정 논리 연산자 사용 flag3:  " + !flag3);
		//연산의 결과가 어떻게 되지 ----> 로깅 한다.
		System.out.println("flag3 :" + flag3);
	}
}

package basic.ch06;

import java.util.Scanner;

//자바의 모든 코드는 class{}블록안에 코드를 작성하기로 약속했다.
public class Function1 {

	
	public static void main(String[] args) {

		int num1;
		int num2;
		int sum;
		add(10, 10);
		

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		boolean flag = true;
		while (flag) {
			a = sc.nextInt();
			b = sc.nextInt();

			if (a < b) {
				flag = false;
				System.out.println(calcSum(a, b));
			} else {
				System.out.println("다시 작성");
			}
		}
		

	} // end of main

	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}

	// 연습 문제
	// 함수를 수정 -- 파라미터 정수 2개를 받을수 있도록 설계
	// s1, s2 -->
	// 1, 10 ---> 55
	static int calcSum(int s1, int s2) {
		int sum = 0;
		int i;
		for (i = s1; i <= s2; i++) { // 횟수 100 번 동작 하는 녀석
			// 0 = 0 + 1
			// 1 = 1 + 2
			// 3 = 3 + 3
			sum = sum + i; // 5050
		}
		return sum;
	}
}

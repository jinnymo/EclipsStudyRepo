package basic.ch03;

import java.util.Scanner;

/*
 * 삼항 연산자(조건 연산자)
 * int num = 조건식? 결과1 : 결과2
 */
public class Operation8 {

	public static void main(String[] args) {

		
		System.out.println("입력 받은 두 수 중에 큰 수를 출력 하세요");
	
		
		//잡바 특징 --> 풍부한 라이브러리 지원
		//jdk ->> 표준 라이블리(자바 개발자들리 만들어준 기능, 도구)
		//데이터 타입(특징 : 
		//콘솔창에서 사용자가 키보드로 입력한 값을 받아주는 녀석이다.
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //사용자가 입력한 정수값을 받아주는 녀석
		System.out.println(" x 의 받은 값은 :" + x);
		int y = sc.nextInt();
		System.out.println("y의 받은 값은 : "+y);
		
		System.out.println("---------------------------");
		
		
		//조건식 ? 결과1 : 결과2;
		int max = x > y ? x : y;
		System.out.println("두 수 중에 더 큰수는?" + max + " 입니다.");
		
		//sc.close();
		
		System.out.println("a 값과 b값 을 입력 해주세요 , 둘중 더큰수 구분");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a > b ? a : b);
		
		
		
	}
}

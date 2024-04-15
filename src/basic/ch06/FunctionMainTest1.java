package basic.ch06;

import java.util.Scanner;

//자바의 모든 코드는 class{}블록안에 코드를 작성하기로 약속했다.
public class FunctionMainTest1 {

	//메인 함수 void - 텅빈 (리턴값이 없다.)
	public static void main(String[] args) {
		System.out.println("여기 메인 함수를 시작합니다.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(Function1.add(a, b));
	}

}
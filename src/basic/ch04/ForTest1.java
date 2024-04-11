package basic.ch04;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {

//		문제 = 화면에 0부터 9까지 출력하시요
//		System.out.println("0");
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");
//		System.out.println("6");
//		System.out.println("7");
//		System.out.println("8");
//		System.out.println("9");
		
		//반복적인 패턴이 보인다면 반복문(for)을 생각하자.
		//0 ~ 9 
		for(int i=0;i<10;i++) {
			//반복적인 패턴에 구문을 작성한다.
			System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
//		for(int i=1;i<10;i++) {
//			//반복적인 패턴에 구문을 작성한다.
//			for(int a=1;a<10;a++) {
//				//반복적인 패턴에 구문을 작성한다.
//				System.out.println(i + " * " + a + " = " + i*a );
//			}
//		}
	}

}

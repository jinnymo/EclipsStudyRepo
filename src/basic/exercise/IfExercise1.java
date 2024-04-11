package basic.exercise;

import java.util.Scanner;

public class IfExercise1 {

	public static void main(String[] args) {

		// 정수값 입력 받기 활용해서 코드에 흐름을 만들어주세요
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A학점");
		}
		else if(score >= 80) {
			System.out.println("B학점");

		}
		else if(score >= 70) {
			System.out.println("C학점");

		}
		else if(score >= 60) {
			System.out.println("D학점");

		}
		else if(score <= 59) {
			System.out.println("F학점");

		}
		
	}

}

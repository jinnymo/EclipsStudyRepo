package basic.ch04;

import java.util.Scanner;

public class whileTest2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 수 까지 출력 할까요? : ");
		boolean flag = true; // 깃발
		int start = 0;
		int end = sc.nextInt();

		while (flag) {
			if (start == end) {
				flag = false;
				return;//실행중 종료할떄;
			}
			System.out.println("start :" + start);
			
			start++;
		}

	}// end of mainㅇ

}// end of class

package basic.ch04;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a >= 20) {
			System.out.println("고등학교를 졸업했습니다.");
		}else {
			System.out.println("학교를 다닌는 중입니다.");
		}

	}

}

package basic.exercise;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
		System.out.print("\n메뉴선택 : ");
		int menuNum = sc.nextInt();
		boolean flag = true;
		
		while(flag) {
			if (menuNum == 1) {
				System.out.println("등록을 선택했습니다.");
				flag = false;
			} else if (menuNum == 2) {
				System.out.println("조회을 선택했습니다.");
				flag = false;
			} else if (menuNum == 3) {
				System.out.println("수정을 선택했습니다.");
				flag = false;
			} else if (menuNum == 4) {
				System.out.println("삭제을 선택했습니다.");
				flag = false;
			} else if (menuNum == 0) {
				System.out.println("종료를 선택했습니다.");
				return;
			} else {
				System.err.println("잘못된 입력입니다. 다시 선택해주세요 : ");
				System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
				menuNum = sc.nextInt();
			}
		}
		
		
		
	}

}

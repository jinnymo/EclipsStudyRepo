package basic.exercise;

import java.util.Scanner;

public class IfExercise2 {

	public static void main(String[] args) {
		
		char grade = 'x';
		String message = "";
		Scanner sc = new Scanner(System.in);

		System.out.print("성적을 입력해주세요 0~100사이 : ");
		int score = sc.nextInt();

		if (score < 0 || score > 100) {
			System.out.println("잘못된 입력입니다. 성적은 0에서 100사이로 입력 해주세요.");
		} else {

			if (score >= 90) {
				grade = 'A';
				message = "우수한 성적이네요! 계속 좋은 성적 유지하길 1바랍니다.";

			} else if (score >= 80) {
				grade = 'B';
				message = "좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!";

			} else if (score >= 70) {
				grade = 'C';
				message = "괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.";

			} else if (score >= 60) {
				grade = 'D';
				message = "학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.";

			} else {
				grade = 'F';
				message = "불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.";

			}

			System.out.println("학점  : " + grade + " || message :" + message);
		}

	}

}

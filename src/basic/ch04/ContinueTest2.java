package basic.ch04;

public class ContinueTest2 {
	public static void main(String[] args) {
		// 1부터 100까지 숫자 중ㅇ에 3의 배수를 출력하세요

		// 1~100 --> 반복적인 패턴인 확인
		// 만약 3의 배수라면 화면에 숫자를 출력하세요
		// for 문 대신에 -->while 변경해서 출력
		int i = 0;
		while (i < 101) {
			i++;
			if (i % 3 == 0) {
				System.out.println(i);
			}

		}

		// 특정조건이 되었을떄 반복문을 멈추어라
		i = 0;
		boolean flag = true;
		while (flag) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
			if (i == 100) {
				flag = false;
			}
			i++;
		}

	}// end of main
}// end of class

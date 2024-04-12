package basic.ch04;

public class BreakTest2 {

	public static void main(String[] args) {
		// 중간에 멈추는 break 문
		// 소수 7이면 반복문을 멈추어라

		int i = 1;

		while (i < 11) {

			if (i % 7 == 0) {
				break;
			} else {
				System.out.println("i의 값 : " + i);
			}
			i++;
		}
	}

}

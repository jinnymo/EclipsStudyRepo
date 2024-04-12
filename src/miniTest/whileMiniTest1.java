package miniTest;

public class whileMiniTest1 {

	public static void main(String[] args) {
		// 1 부터 10까지 덧셈에 연산을 콘솔창에 출력 하시오 단, while 구문 작성

		int a = 1;
		int result = 0;
		int start = 1;
		//특정 조건식을 만들어 반복문을 멈추게 해야한다
		//만약 START 값이 10일떄 종료 하라
		boolean flag = true;
		
		while(flag) {
			
			if(a == 10) {
				//실행에 제어권 반납
				flag = false;
				break;
			}
			
			result += a;
			a++;
			
			
		}
		
		System.out.println(result);
		
		
	}

}

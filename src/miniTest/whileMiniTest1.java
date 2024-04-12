package miniTest;

public class whileMiniTest1 {

	public static void main(String[] args) {
		//1 부터 10까지 덧셈에 연산을 콘솔창에 출력 하시오 단, while 구문 작성 
		
		int a = 1;
		int result=0;
		while(a<11) {
			
			 result+=a;
			 System.out.println(result);
			 System.out.println(a); 
			 a++;
		}
	}

}

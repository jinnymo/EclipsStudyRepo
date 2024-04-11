package basic.ch03;

public class Operation2 {
	
	public static void main(String[] args) {
		
		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		//고민 해볼 사항
		//int result4 = 5/3;
		double result4 = 5.0 / 3;
		double result5 = 5 % 3.4;
		
		System.out.println("result1 :" + result1);
		System.out.println("result2 :" + result2);
		System.out.println("result3 :" + result3);
		System.out.println("result4 :" + result4);
		System.out.println("result5 :" + result5);
		
		//문제
		//1.(12+3)/3 값을 화면에 출력해보세요
		int value1 = 12;
		int value2 = 3;
		System.out.println((value1+value2)/value2);
		//2. (25 %2) 값을 화면에 출력해보세요
		//어떤수를 2로 나누었을 떄 나머지가 0이면 짝수 1이면 홀수
		
		int resulta = 25%2;
		System.out.println(resulta);
		
		//3. 15를 4로 나눈 후, 그 결과의 절대값을 출력하세요
	
		double result_b = Math.abs((double)15/4);
		System.out.println(result_b);
		
		//-7을 99으로 나누고 그 결과의 절대값을 출력하세요
		double result_c = Math.abs((double)-7/99);
		System.out.println(result_c);
		
		//82-((15%2)/4) 의
		int result_d = 82-((15%2)/4);
		System.out.println(result_d);
	}
}

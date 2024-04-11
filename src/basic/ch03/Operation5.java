package basic.ch03;

/*
 * 관계 , 비교 연산자
 * 연산의 결과 값이 무조건 ture, flase로 반환된다.
 */
public class Operation5 {
	
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 3;
		
		//관계 연산자를 주어로 바라보자
		boolean value = (num1 > num2);
		
		System.out.println(3 < 5);
		System.out.println(3 >= 10);
		System.out.println(3 <= 3);
		System.out.println(3 == 5);
		System.out.println(3 != 5);
		
		System.out.println("-----------------------");
		
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		System.out.println("-----------------------");
		
		String a = "100";
		String b = "100";
		String c = "10";
		String d = new String();
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a == d);		
		System.out.println(a.equals(b));
		System.out.println(a.equals(d));
		
		
	}
	
}

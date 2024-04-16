package basic.ch07;

import java.util.Scanner;

public class User {

	String id;
	String password;
	String name;
	String gender;
	int age;

	// password 체크 기능
	// 함수는 동사로 시작하는것이 권장사항
	public boolean checkPassword(String inputPwd) {
		// 만약 나의 멤버변수에 들어가있는
		// password 값과 외부에서 넣을 값이 같으면 true;
		if (password.equals(inputPwd)) {
			return true;
		}
		return false;

	}
	//독립적인 함수로서 여기서 실행 가능
	public static void main(String[] args) {
		//User 클래스를 인스턴스화 시켜주세요
		User user1 = new User();//메모리에 올라간다.
		User user2 = new User();//메모리에 올라간다.
		user1.password = "123";
		user2.password = "555";
		
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드 입력");
		String getPwd = sc.next();
		boolean user1Result= user1.checkPassword(getPwd);
		System.out.println("user1 : " + user1Result);
		
		boolean user2Result = user2.checkPassword("");
		System.out.println("user2 : " + user2Result);
		
		
		
	}
}

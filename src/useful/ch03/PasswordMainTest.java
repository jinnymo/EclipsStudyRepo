package useful.ch03;

public class PasswordMainTest {
	public static void main(String[] args) {
		Password password = new Password();
		
		String inputPwd = null;
		inputPwd = "as";
		
		//1. 직접 예외 처리
		//2. 던지기
		
		try {
			password.setPwd(inputPwd);
		} catch (PasswordException e) {
			System.out.println("우리가 정의한 password 예외 발생");
		} catch (Exception e) {
			System.out.println("예외 발생" +e.getMessage());
		}
		password.setPwd(inputPwd);
		
	}
}

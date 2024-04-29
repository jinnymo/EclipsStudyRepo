package useful.ch03;

public class NickNameMainTest {

	public static void main(String[] args) {
		
		NickName nickName = new NickName();

		String inputNickName = null;

		inputNickName = "gh2564";
		System.out.println(inputNickName.length());
	
		try {
			nickName.setnickName(inputNickName);
		} catch (NickNameException e) {
			System.out.println("우리가 설정한 에러 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("예외 발생 " + e.getMessage());
		}
		
		nickName.setnickName(inputNickName);
		System.out.println("good");
	}

}

package useful.ch03;

public class NickName {
	
	private String nickName;
	
	public String getnickName() {
		return nickName;
	}
	
	public void setnickName(String nickName) throws NickNameException{
		
		if(nickName == null) {
			throw new NickNameException("닉네임은 필수 입력값입니다.");
		}
		if(nickName.length() > 10 || nickName.length() < 4 ) {
			throw new NickNameException("닉네임은 4글자 이상 10글자 이하이어야 합니다.");
		}
		if(!nickName.matches("[a-zA-Z0-9]+")) {
			throw new NickNameException("닉네임은 숫자 및  영문 소문자와 대문자로만 작성 가능합니다.");
		}
		
		
		this.nickName = nickName;
	}
}

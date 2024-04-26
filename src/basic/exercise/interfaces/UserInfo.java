package basic.exercise.interfaces;


//DTO 개념으로 볼수있다.
public class UserInfo {

	public static int SERIAL_NUM =0 ;
	private int id; //PK ->홍길동, 나이 같은수 있음 //식별자 사용
	private String userName;
	private String pw;
	
	public UserInfo(String userString, String pw) {
	this.userName = userName;
	this.pw = pw;
	}
	
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getPw() {
		return pw;
	}
	
	@Override
	public String toString() {
		return id + userName +"," + pw;
	}
	
}

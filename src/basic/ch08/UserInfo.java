package basic.ch08;

public class UserInfo {

	public String userID;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	//생성자 오버로딩이란
	//생성자의 개수가 여러개 있다
	
	public UserInfo(){}
	
	public UserInfo(String id) {
		userID = id;
	}
	
	public UserInfo(String id, String name) {
		userID = id;
		userName = name;
	}
	
	//연습문제 
	//1 - 매개변수 3개를 받는 생성자를 만들어보세요
	public UserInfo(String id, String name,String pwd) {
		userID = id;
		userName = name;
		userPassword = pwd;
	}
	//2번 매개변수 4개를 받는 생성자 만들어주세요
	public UserInfo(String id, String name,String pwd, String adress) {
		userID = id;
		userName = name;
		userPassword = pwd;
		userAddress = adress;
	}
	//3번 매개변수 5개를 받는 생성자 만들어주세요
	public UserInfo(String id, String name,String pwd, String adress,String phoneNum) {
		userID = id;
		userName = name;
		userPassword = pwd;
		userAddress = adress;
		phoneNumber = phoneNum;
	}
}

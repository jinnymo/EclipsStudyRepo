package structure.ch07;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class UserRegistraitionSystem {

	private Map<String, User> users =new LinkedHashMap<>();
	
	//정적 내부 클래스
	static class User{
		
		String name;
		String email;
		
		public User(String name, String email) {
			this.name = name;
			this.email = email;
			
		}
		@Override
		public String toString() {
			return "이름 : " +name + ", 이메일"+ email;
		}
		
	}
	
	//사용자 등록기능
	public void addUser(String name, String email) {
		users.put(email, new User(name,email));
	}
	//사용자 출력 기능
	public void displayUsers() {
		for(User user : users.values()) {
			System.out.println(user.toString());
		}
	}
	
	
	public static void main(String[] args) {
		
		UserRegistraitionSystem system = new UserRegistraitionSystem();
		
		User user1 = new User("홍길동1","a@naver.com");
		User user2 = new User("홍길동2","b@naver.com");
		User user3 = new User("홍길동3","c@naver.com");
		
		system.addUser(user1.name, user1.email);
		system.addUser(user2.name, user2.email);
		system.addUser(user3.name, user3.email);
		
		system.addUser("홍길동4","d@naver.com");
		system.addUser("홍길동5","d@naver.com");
		
		system.displayUsers();
		//Map 구조는 기본적으로 순서를 보장하지 않지만 linkedHashMap을 사용해서 해결
		
		
	}
}

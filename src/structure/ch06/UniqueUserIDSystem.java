package structure.ch06;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {

	private HashSet<String> userIDs;
	private Scanner sc;
	public UniqueUserIDSystem() {
	 this.userIDs = new HashSet<String>();
	}
	
	//사용자 ID등록
	public boolean registerUserID(String userID) {
		return userIDs.add(userID);
	}
	
	public void run() {
		
		while(true) {
			System.out.println("id 입력");
			sc = new Scanner(System.in);
			if (registerUserID(sc.next())) {
				System.out.println("저장 완료!!!");
			}else {
				System.out.println("중복값이어서 저장 x");
			}
			
			
		}
	}
	public static void main(String[] args) {
		UniqueUserIDSystem system = new UniqueUserIDSystem();
		system.run();
	}
	
}

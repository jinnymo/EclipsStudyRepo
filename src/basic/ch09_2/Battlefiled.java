package basic.ch09_2;

import java.util.Scanner;

public class Battlefiled {
	
	

	public static void main(String[] args) {
		
		Warrior[] warrior = new Warrior[5]; //5개의 warrior 인스턴스 공간을 스택메모리에 만듬
		for (int i = 0; i < warrior.length; i++) {
			
			System.out.println(warrior[i]);
			warrior[i] = new Warrior(10,10);// 위에서 미리선언한 5개의 인스턴스에 값을 넣어 주면서 heap 메모리 공간에 데이터 저장
			System.out.println(warrior[i]);
			
		}
		

	}


}
